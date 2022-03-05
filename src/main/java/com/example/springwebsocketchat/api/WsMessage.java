package com.example.springwebsocketchat.api;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class WsMessage {

    private String sender;
    private String message;
}
