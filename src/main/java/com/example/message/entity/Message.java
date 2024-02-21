package com.example.message.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

//entity / api response
@Component
public class Message {

    @Setter @Getter private int messageId;
    @Setter @Getter private String message;
}
