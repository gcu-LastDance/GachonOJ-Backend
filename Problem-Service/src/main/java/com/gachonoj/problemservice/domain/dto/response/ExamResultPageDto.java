package com.gachonoj.problemservice.domain.dto.response;

import lombok.*;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
public class ExamResultPageDto {
    private String examTitle;
    private String examMemo;
    private int submissionTotal;
    private List<ExamResultListDto> results;

    @Builder
    private ExamResultPageDto(String examTitle, String examMemo, int submissionTotal, List<ExamResultListDto> results) {
        this.examTitle = examTitle;
        this.examMemo = examMemo;
        this.submissionTotal = submissionTotal;
        this.results = results;
    }
}