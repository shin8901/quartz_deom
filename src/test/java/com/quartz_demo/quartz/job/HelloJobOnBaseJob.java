package com.quartz_demo.quartz.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * ########### step2 ###########
 * HelloJob 을 베이스잡을 기준으로 만들고
 * JobChain 을 만들어본다.
 */
@Slf4j
public class HelloJobOnBaseJob extends BaseJob {

    @Override
    protected void doExecute(JobExecutionContext context) {
        log.info("HERE !!!!!!! I'M PROCESSING ");
        log.info("####################################### Hello Job is being executed!");
    }
}