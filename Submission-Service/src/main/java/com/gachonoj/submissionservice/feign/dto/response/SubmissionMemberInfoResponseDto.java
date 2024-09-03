package com.gachonoj.submissionservice.feign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class SubmissionMemberInfoResponseDto {
    private Integer solvedProblemCount;
    private Integer tryProblemCount;

    @Builder
    private SubmissionMemberInfoResponseDto(Integer solvedProblemCount, Integer tryProblemCount) {
        this.solvedProblemCount = solvedProblemCount;
        this.tryProblemCount = tryProblemCount;
    }
}
