package com.galileo.cu.servicio_websocket.services;

@Service
public class WebSocketService {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public void sendError(String errorMessage) {
        messagingTemplate.convertAndSend("/topic/errors", errorMessage);
    }
}
