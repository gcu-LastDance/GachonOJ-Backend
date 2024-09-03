package com.gachonoj.problemservice.domain.dto.response;

import lombok.*;

import java.util.List;

@Getter
public class ExamResultDetailsResponseDto {
    private String examTitle;
    private String examMemo;
    private int submissionTotal;
    private String memberName;
    private String memberNumber;
    private String memberEmail;
    private int testTotalScore;
    private String testDueTime;
    private String submissionDate;
    private List<QuestionResultDetailsResponseDto> examQuestions;

    @Builder
    private ExamResultDetailsResponseDto(String examTitle, String examMemo, int submissionTotal, String memberName, String memberNumber, String memberEmail, int testTotalScore, String testDueTime, String submissionDate, List<QuestionResultDetailsResponseDto> examQuestions) {
        this.examTitle = examTitle;
        this.examMemo = examMemo;
        this.submissionTotal = submissionTotal;
        this.memberName = memberName;
        this.memberNumber = memberNumber;
        this.memberEmail = memberEmail;
        this.testTotalScore = testTotalScore;
        this.testDueTime = testDueTime;
        this.submissionDate = submissionDate;
        this.examQuestions = examQuestions;
    }
}

