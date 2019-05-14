package org.ironman.ticketsellingsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication()
@EnableScheduling
@MapperScan("org.ironman.ticketsellingsystem.dao")//让spring扫描dao接口
public class TicketsellingsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketsellingsystemApplication.class, args);
    }

}
