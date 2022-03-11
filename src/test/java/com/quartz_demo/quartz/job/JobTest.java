package com.quartz_demo.quartz.job;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

public class JobTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws SchedulerException, InterruptedException {
        // jobBuilder 로 JobDetail 처리
        JobDetail job = newJob(HelloJob.class).build();

        //실행 시점 결정?
        Trigger trigger = newTrigger().build();

        Scheduler defaultScheduler = StdSchedulerFactory.getDefaultScheduler();
        defaultScheduler.start();
        defaultScheduler.scheduleJob(job,trigger);

        Thread.sleep(3 * 1000);

        defaultScheduler.shutdown();
    }

}

