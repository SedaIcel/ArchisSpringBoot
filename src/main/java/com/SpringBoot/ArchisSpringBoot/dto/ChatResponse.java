package com.SpringBoot.ArchisSpringBoot.dto;

import com.SpringBoot.ArchisSpringBoot.data.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatResponse {
    private List<Choice> Choices;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Choice{
        private int index;
        private Message message;


    }
}
