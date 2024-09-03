package com.gachonoj.submissionservice.feign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class CorrectRateResponseDto {
    private Long problemId;
    private Double correctRate;

    @Builder
    private CorrectRateResponseDto(Long problemId, Double correctRate) {
        this.problemId = problemId;
        this.correctRate = correctRate;
    }
}
