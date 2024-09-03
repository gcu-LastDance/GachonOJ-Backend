package com.gachonoj.aiservice.domain.dto.request;

import com.gachonoj.aiservice.domain.dto.response.Message;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ChatGPTRequest {
    private String model;
    private List<Message> messages = new ArrayList<>();

    @Builder
    private ChatGPTRequest(String model, String prompt) {
        this.model = model;
        this.messages.add(Message.builder()
            .role("user")
            .content(prompt)
            .build());
    }
}
