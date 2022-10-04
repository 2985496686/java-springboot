package com.config;

import com.Job.QuartzDemo01;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

    public class Demo01Config{
        @Bean
        public JobDetail demo01Job(){
            return JobBuilder.newJob(QuartzDemo01.class)
                    .withIdentity("demo01Job")//为该Job起名，用于绑定Trigger
                    .storeDurably()//在未关联Trigger时，该Job是否要保留；调用该方法会设置为true
                    .build();
        }

        @Bean
        public Trigger demo01Trigger(){
            ScheduleBuilder scheduleBuilder = SimpleScheduleBuilder
                    .simpleSchedule()
                    .repeatForever()//让定时任务一直重复执行。默认只执行一次
                    .withIntervalInSeconds(2);
            return TriggerBuilder.newTrigger()
                    .forJob("demo01Job")
                    .withSchedule(scheduleBuilder)
                    .build();
        }
    }
}
