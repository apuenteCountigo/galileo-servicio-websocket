package com.galileo.cu.servicio_websocket.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate = null;

    @Autowired
    ObjectMapper objectMapper;

    public KafkaService(KafkaTemplate<String, String> kafkaTemplate,
            ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    @KafkaListener(topics = "errors-notifications")
    public void errorsHandler(String mensaje) throws JsonProcessingException {
        log.info(":::::mensaje");
        log.info(mensaje);
    }
}
