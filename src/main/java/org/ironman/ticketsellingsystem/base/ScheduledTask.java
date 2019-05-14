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
    public final static long ONE_Minute =  60 * 1000;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Integer count0 = 1;
    private Integer count1 = 1;
    private Integer count2 = 1;
    @Resource
    UserTrainMapper userTrainMapper;
    @Scheduled(fixedRate = ONE_Minute)

    public void reportCurrentTime() throws InterruptedException {
        UserTrainEntity entity=userTrainMapper.selectByPrimaryKey(1);
//        List mlist=userTrainMapper.selectByState(entity);
        System.out.println(String.format("---第%s次执行，当前时间为：%s", count0++, dateFormat.format(new Date()))+"--订单时间："+entity.getOrderTime());

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