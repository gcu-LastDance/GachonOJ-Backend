package com.gachonoj.submissionservice.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class TodaySubmissionCountResponseDto {
    private Integer totalSubmissionCount;
    private Integer correctSubmissionCount;
    private Integer incorrectSubmissionCount;

    @Builder
    private TodaySubmissionCountResponseDto(Integer totalSubmissionCount, Integer correctSubmissionCount, Integer incorrectSubmissionCount) {
        this.totalSubmissionCount = totalSubmissionCount;
        this.correctSubmissionCount = correctSubmissionCount;
        this.incorrectSubmissionCount = incorrectSubmissionCount;
    }
}
