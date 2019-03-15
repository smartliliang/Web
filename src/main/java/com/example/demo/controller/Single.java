package com.example.demo.controller;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;

import javax.jms.Destination;

/**
 * Created by ASUS on 2018/12/29.
 */
public class Single {

    private static Single single=new Single();

    public static Single  getInstance(){
        return single;
    }

    Destination destination = new ActiveMQQueue("java");
    Destination destination1 = new ActiveMQTopic("topic");
}
