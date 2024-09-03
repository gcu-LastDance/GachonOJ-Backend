package com.gachonoj.submissionservice.feign.dto.response;

import lombok.*;

import java.util.List;

@Getter
public class SubmissionExamResultInfoResponseDto {
    private List<SubmissionDetailDto> submissions;

    public SubmissionExamResultInfoResponseDto(List<SubmissionDetailDto> submissions) {
        this.submissions = submissions;
    }
}
