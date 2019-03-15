package com.example.demo.service.Impl;

import com.example.demo.service.SocketSendMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Created by ASUS on 2018/12/28.
 */
@Service
public class SocketSendMessageImpl implements SocketSendMessage  {

    @Override
    @JmsListener(destination = "topic")
    public void receiveMessage(String message) {
        System.out.println("第二条线路"+message);
    }

    @Override
    @JmsListener(destination = "topic")
    public void receiveMessage1(String message) {System.out.println("第一条线路"+message);
    }


}
