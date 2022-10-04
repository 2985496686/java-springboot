package com.Job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 使用spring提供的Task来完成定时任务
 */

@EnableScheduling//开启定时任务机制
//@Component
public class TaskDemo {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Scheduled(fixedDelay = 2000)
    public void test(){
        AtomicInteger i = new AtomicInteger(0);
        logger.info("[定时任务第({})]次执行",i);
    }

}
