package com.gachonoj.aiservice.domain.dto.response;

import lombok.*;

@Getter
public class TokenUsageResponseDto {
    private Long todayTokenUsage;
    private Long totalTokenUsage;

    @Builder
    private TokenUsageResponseDto(Long todayTokenUsage, Long totalTokenUsage) {
        this.todayTokenUsage = todayTokenUsage;
        this.totalTokenUsage = totalTokenUsage;
    }
}
