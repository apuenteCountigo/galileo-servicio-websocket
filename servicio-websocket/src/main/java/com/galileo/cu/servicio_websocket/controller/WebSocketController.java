package com.galileo.cu.servicio_websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class WebSocketController {

    @MessageMapping("/toBackend")
    public void getMessage(Message message) {
        log.info(":::::Mensaje::: " + message);
    }
}
