package com.gachonoj.aiservice.domain.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Message {
    private String role;
    private String content;

    @Builder
    private Message(String role, String content) {
        this.role = role;
        this.content = content;
    }
}
