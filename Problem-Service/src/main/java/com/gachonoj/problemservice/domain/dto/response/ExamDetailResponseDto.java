package com.gachonoj.problemservice.domain.dto.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class ExamDetailResponseDto {
    private Long examId;
    private String examTitle;
    private String examContents;
    private String examStartDate;
    private String examEndDate;
    private String examStatus;
    private String examType;
    private String examMemo;
    private String examNotice;
    private Integer examDueTime;
    private List<Long> candidateList;
    private List<ProblemDetailAdminResponseDto> tests;

    @Builder
    private ExamDetailResponseDto(Long examId, String examTitle, String examContents, String examStartDate, String examEndDate, String examStatus, String examType, String examMemo, String examNotice, Integer examDueTime, List<Long> candidateList, List<ProblemDetailAdminResponseDto> tests) {
        this.examId = examId;
        this.examTitle = examTitle;
        this.examContents = examContents;
        this.examStartDate = examStartDate;
        this.examEndDate = examEndDate;
        this.examStatus = examStatus;
        this.examType = examType;
        this.examMemo = examMemo;
        this.examNotice = examNotice;
        this.examDueTime = examDueTime;
        this.candidateList = candidateList;
        this.tests = tests;
    }
}