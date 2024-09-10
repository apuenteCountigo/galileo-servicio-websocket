package com.galileo.cu.servicio_websocket.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
    @MessageMapping("/sendError")
    @SendTo("/topic/errors")
    public String handleError(String errorMessage) {
        return errorMessage;
    }
}
