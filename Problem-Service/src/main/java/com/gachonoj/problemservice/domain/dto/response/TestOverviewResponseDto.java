package com.gachonoj.problemservice.domain.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestOverviewResponseDto {
    private Long testId;
    private Long examId;
    private String examTitle;
    private String examStartDate;
    private String examEndDate;
    private boolean completed;

    @Builder
    private TestOverviewResponseDto(Long testId, Long examId, String examTitle, String examStartDate, String examEndDate, boolean completed) {
        this.testId = testId;
        this.examId = examId;
        this.examTitle = examTitle;
        this.examStartDate = examStartDate;
        this.examEndDate = examEndDate;
        this.completed = completed;
    }
}