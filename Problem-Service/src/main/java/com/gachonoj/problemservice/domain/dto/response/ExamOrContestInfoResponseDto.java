package com.gachonoj.problemservice.domain.dto.response;

import com.gachonoj.problemservice.domain.entity.Exam;
import lombok.*;

import java.time.LocalDateTime;

@Getter
public class ExamOrContestInfoResponseDto {
    private Long examId;
    private String examTitle;
    private String memberNickname;
    private String examContents;
    private String examStartDate;
    private String examEndDate;
    private String examType;
    private String examNotice;

    @Builder
    private ExamOrContestInfoResponseDto(Long examId, String examTitle, String memberNickname, String examContents, String examStartDate, String examEndDate, String examType, String examNotice) {
        this.examId = examId;
        this.examTitle = examTitle;
        this.memberNickname = memberNickname;
        this.examContents = examContents;
        this.examStartDate = examStartDate;
        this.examEndDate = examEndDate;
        this.examType = examType;
        this.examNotice = examNotice;
    }
}