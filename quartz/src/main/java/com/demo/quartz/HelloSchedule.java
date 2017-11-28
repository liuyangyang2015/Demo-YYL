package com.demo.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2017-11-26 13:52
 **/
public class HelloSchedule
{
    private static final Logger logger = LoggerFactory.getLogger(HelloSchedule.class);
    public static void main(String[] args)
    {
        JobDetail jobDetail =  JobBuilder.newJob(HelloJob.class).withIdentity("myjJob","group1").build();
        Trigger trigger = TriggerBuilder.newTrigger().startNow().withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever()).build();

        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        try
        {
            Scheduler scheduler = schedulerFactory.getScheduler();
            scheduler.start();
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("HelloSchedule "+simpleDateFormat.format(date) );
            scheduler.scheduleJob(jobDetail,trigger);
        } catch (SchedulerException e)
        {
            e.printStackTrace();
        }

    }
}
