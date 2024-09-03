package com.gachonoj.aiservice.domain.dto.response;

import jakarta.ws.rs.core.EntityPart;
import lombok.*;

import java.util.List;

@Getter
public class ChatGPTResponse {
    private List<Choice> choices;
    private Usage usage;

    @Getter
    public static class Choice {
        private int index;
        private Message message;
    }

    @Getter
    public static class Usage {
        private int completion_tokens;
        private int prompt_tokens;
        private int total_tokens;
    }
}
