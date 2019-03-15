package com.example.demo.service;

import javax.jms.Destination;

/**
 * Created by ASUS on 2018/12/28.
 */
public interface WebSocketProducer {
    void sendMessage(Destination destination, String payload);

}
