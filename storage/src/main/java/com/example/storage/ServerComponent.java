package com.example.storage;

import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServerComponent{
    private final JmsTemplate jmsTemplate;

    public String get(String key) {
        return (String) jmsTemplate.receiveAndConvert(key);
    }

    public void set(String key, String value) {
        jmsTemplate.convertAndSend(key, value);
    }
}


