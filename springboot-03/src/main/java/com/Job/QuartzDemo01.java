package com.Job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.concurrent.atomic.AtomicInteger;


public class QuartzDemo01 extends QuartzJobBean {

    private static AtomicInteger i = new AtomicInteger();
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        logger.info("[定时任务第({})次执行]",i.incrementAndGet());
    }
}
