package com.gachonoj.problemservice.feign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class SubmissionDetailDto {
    private Long problemId;
    private boolean isCorrect;
    private String submissionCode;
    private Integer questionSequence;
    private Integer questionScore;

}