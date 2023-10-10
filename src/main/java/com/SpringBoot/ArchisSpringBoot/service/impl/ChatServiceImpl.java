package com.SpringBoot.ArchisSpringBoot.service.impl;

import com.SpringBoot.ArchisSpringBoot.dto.ChatRequest;
import com.SpringBoot.ArchisSpringBoot.dto.ChatResponse;
import com.SpringBoot.ArchisSpringBoot.service.ChatService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChatServiceImpl implements ChatService {
    @Qualifier("open-ai")
    private final RestTemplate restTemplate;

    @Value("${openai.model}")
    public String model;

    @Value("${openai.api.url}")
    private String URL;

    public ChatServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String sendMessage(String message) {
        ChatRequest request = new ChatRequest(model, message);
        ChatResponse response = restTemplate.postForObject(URL, request, ChatResponse.class);
        return response.getChoices().get(0).getMessage().getContent();
    }
}
