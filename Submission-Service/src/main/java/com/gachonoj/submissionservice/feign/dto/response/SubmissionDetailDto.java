package com.gachonoj.submissionservice.feign.dto.response;

import lombok.*;

@Getter
public class SubmissionDetailDto {
    private Long problemId;
    private boolean isCorrect;
    private String submissionCode;

    @Builder
    private SubmissionDetailDto(Long problemId, boolean isCorrect, String submissionCode) {
        this.problemId = problemId;
        this.isCorrect = isCorrect;
        this.submissionCode = submissionCode;
    }
}
