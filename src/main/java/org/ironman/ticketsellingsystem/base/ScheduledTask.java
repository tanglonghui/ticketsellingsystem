package org.ironman.ticketsellingsystem.base;

import org.ironman.ticketsellingsystem.dao.TrainMapper;
import org.ironman.ticketsellingsystem.dao.UserTrainMapper;
import org.ironman.ticketsellingsystem.entity.TrainEntity;
import org.ironman.ticketsellingsystem.entity.UserTrainEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class ScheduledTask {
    public final static long ONE_Minute = 60 * 1000;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date now;
    private Integer count0 = 1;
    private Integer count1 = 1;
    private Integer count2 = 1;
    @Resource
    UserTrainMapper userTrainMapper;
    @Resource
    TrainMapper trainMapper;

    //每分钟检测一次未支付的订单，看订单是否到期
    @Scheduled(fixedRate = ONE_Minute)
    public void reportCurrentTime() throws InterruptedException {
        List<UserTrainEntity> mlist = userTrainMapper.selectAllByState("0");
        now = new Date();
        //未支付的临时订单
        for (UserTrainEntity bean : mlist) {
            if (now.getTime() - bean.getOrderTime().getTime() > 15 * 60000) {
                bean.setState("2");
                int i = userTrainMapper.updateByPrimaryKey(bean);
                if (i == 1) {
                    System.out.println("订单" + bean.getId() + "自动失效");
                } else if (now.getTime() > bean.getStartTime().getTime()) {
                    bean.setState("2");
                    int i2 = userTrainMapper.updateByPrimaryKey(bean);
                    if (i2 == 1) {
                        System.out.println("订单" + bean.getId() + "自动失效");
                    }

                }
                //释放占用的座位
                TrainEntity trainEntity = trainMapper.selectByPrimaryKey(bean.getTrainId());
                Integer seat;
                //商务座
                if (bean.getSeat().equals("0")) {
                    seat = Integer.parseInt(trainEntity.getBusinessSeat());
                    seat++;
                    trainEntity.setBusinessSeat(seat.toString());
                    trainMapper.updateByPrimaryKeySelective(trainEntity);
                }
                //一等座
                else if (bean.getSeat().equals("1")) {
                    seat = Integer.parseInt(trainEntity.getFirstSeat());
                    seat++;
                    trainEntity.setFirstSeat(seat.toString());
                    trainMapper.updateByPrimaryKeySelective(trainEntity);

                }
                //二等座
                else if (bean.getSeat().equals("2")) {
                    seat = Integer.parseInt(trainEntity.getSecondSeat());
                    seat++;
                    trainEntity.setSecondSeat(seat.toString());
                    trainMapper.updateByPrimaryKeySelective(trainEntity);
                }
            }
        }
        //已支付，过了发车时间的订单
        List<UserTrainEntity> mlist2 = userTrainMapper.selectAllByState("1");
        for (UserTrainEntity bean : mlist2) {
            if (now.getTime() > bean.getStartTime().getTime()) {
                bean.setState("2");
                int i = userTrainMapper.updateByPrimaryKey(bean);
                if (i == 1) {
                    System.out.println("订单" + bean.getId() + "过期");
                }

            }
        }
        System.out.println(String.format("订单自动失效---第%s次执行，当前时间为：%s", count0++, dateFormat.format(now)));

    }

//    @Scheduled(fixedDelay = 5000)
//    public void reportCurrentTimeAfterSleep() throws InterruptedException {
//        System.out.println(String.format("===第%s次执行，当前时间为：%s", count1++, dateFormat.format(new Date())));
//    }
//
//    @Scheduled(cron = "0 0 1 * * *")
//    public void reportCurrentTimeCron() throws InterruptedException {
//        System.out.println(String.format("+++第%s次执行，当前时间为：%s", count2++, dateFormat.format(new Date())));
//    }

}