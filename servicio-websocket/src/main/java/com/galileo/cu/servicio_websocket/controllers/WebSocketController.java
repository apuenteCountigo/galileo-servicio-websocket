package com.galileo.cu.servicio_websocket.controllers;

@Controller
public class WebSocketController {
    @MessageMapping("/sendError")
    @SendTo("/topic/errors")
    public String handleError(String errorMessage) {
        return errorMessage;
    }
}
