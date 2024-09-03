package com.gachonoj.submissionservice.feign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class SubmissionCodeInfoResponseDto {
    private Long problemId;
    private String code;

    @Builder
    private SubmissionCodeInfoResponseDto(Long problemId, String code) {
        this.problemId = problemId;
        this.code = code;
    }
}
