package com.gachonoj.problemservice.feign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class CorrectRateResponseDto {
    private Long problemId;
    private Double correctRate;
}
