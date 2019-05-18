package org.ironman.ticketsellingsystem.base;

import org.ironman.ticketsellingsystem.dao.UserTrainMapper;
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

    //每分钟检测一次未支付的订单，看订单是否到期
    @Scheduled(fixedRate = ONE_Minute)
    public void reportCurrentTime() throws InterruptedException {
        List<UserTrainEntity> mlist = userTrainMapper.selectAllByState("0");
        now = new Date();
        for (UserTrainEntity bean : mlist) {
            if (now.getTime() - bean.getOrderTime().getTime() > 15 * 60000) {
                bean.setState("2");
                int i = userTrainMapper.updateByPrimaryKey(bean);
                if (i == 1) {
                    System.out.println("订单" + bean.getId() + "自动失效");
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