package com.example.demo.controller;

import com.example.demo.service.SocketSendMessage;
import com.example.demo.service.WebSocketProducer;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.servlet.http.HttpSession;

/**
 * Created by ASUS on 2018/12/29.
 */
@RestController
public class TestController {

    @Resource
    private WebSocketProducer webSocketProducer;
   /* @Resource
    private SocketSendMessage socketSendMessage;*/

    @RequestMapping("/sendMessage")
    public String SendMessage(String message, HttpSession session){
        webSocketProducer.sendMessage(Single.getInstance().destination,"liliang:"+message);
        return "chat";
    }

    @RequestMapping("/sendMessage1")
    public String SendMessage1(String message, HttpSession session){
        webSocketProducer.sendMessage(Single.getInstance().destination1,"liliang:"+message);
        return "chat";
    }





}
