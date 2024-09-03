package com.gachonoj.problemservice.feign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class SubmissionResultCountResponseDto {
    private Long problemId;
    private Integer submitCount;
    private Integer incorrectCount;
}
