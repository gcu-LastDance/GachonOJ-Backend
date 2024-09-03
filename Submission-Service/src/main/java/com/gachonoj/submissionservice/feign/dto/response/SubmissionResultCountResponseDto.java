package com.gachonoj.submissionservice.feign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class SubmissionResultCountResponseDto {
    private Long problemId;
    private Integer submitCount;
    private Integer incorrectCount;

}
