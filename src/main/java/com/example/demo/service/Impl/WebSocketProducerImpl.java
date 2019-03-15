package com.example.demo.service.Impl;

import com.example.demo.controller.Single;
import com.example.demo.service.WebSocketProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * Created by ASUS on 2018/12/28.
 */
@Service
public class WebSocketProducerImpl implements WebSocketProducer {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Override
    public void sendMessage(Destination destination, String payload) {
        /* 发送消息
           @param destination 要发送到的队列
           @param payload 待发送的消息      */
         jmsMessagingTemplate.convertAndSend(destination,payload);

    }
}
