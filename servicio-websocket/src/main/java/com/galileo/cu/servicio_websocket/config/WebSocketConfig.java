package com.galileo.cu.servicio_websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.galileo.cu.servicio_websocket.controller.GalileoWebSocketHandler;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    private final GalileoWebSocketHandler gWebSocketHandler;

    public WebSocketConfig(GalileoWebSocketHandler gWebSocketHandler) {
        this.gWebSocketHandler = gWebSocketHandler;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(gWebSocketHandler, "/ws").setAllowedOrigins("*");
    }
}
