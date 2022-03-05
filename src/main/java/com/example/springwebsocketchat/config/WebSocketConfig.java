package com.example.springwebsocketchat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

import java.util.Collections;

@Configuration  // springe conf dosyasi olacagini belirtiyorum
@EnableWebSocketMessageBroker  // websocket in message broker izin veriyorum
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /*
    * client dan gelen mesajları websocket in mesaj cercevesi olan stomp ile chat portuna yazıyorum*/
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat").setAllowedOrigins(String.valueOf(Collections.singletonList("*"))).withSockJS();
    }

    /*
    * topic portuna yani message broker subscripe olan herkese mesaji iletiyorum*/
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");
    }
}
