package com.galileo.cu.servicio_websocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galileo.cu.servicio_websocket.dto.ErrorMessage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class GalileoWebSocketHandler extends TextWebSocketHandler {

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        log.info("Conexión establecida con el cliente: " + session.getId());
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        log.info("Mensaje recibido: " + message.getPayload());
        ErrorMessage ErrMsg = new ErrorMessage();
        ErrMsg.setScreenName("OperationForm");
        ErrMsg.setStatus("500");
        ErrMsg.setMessage(message.getPayload());
        String errorSend = objectMapper.writeValueAsString(ErrMsg);
        // Respuesta al cliente
        session.sendMessage(new TextMessage(errorSend));
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        log.info("Conexión cerrada: " + session.getId());
    }

}
