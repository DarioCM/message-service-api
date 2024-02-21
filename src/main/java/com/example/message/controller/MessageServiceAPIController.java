package com.example.message.controller;

// Controller component that will listen to requests in a certain address and send the response

import com.example.message.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageServiceAPIController {

    @Autowired
    private Message messageEntity;

    @RequestMapping(path = "/message")
    public Message sendMessage(
            @RequestParam(value = "messageid") int messageId,
            @RequestParam(value = "message", defaultValue = "This is a default message") String message) {

        messageEntity.setMessageId(messageId);
        messageEntity.setMessage(String.format("The message received is: %s",message));

        return messageEntity;
    }

}
