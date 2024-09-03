package com.gachonoj.problemservice.domain.dto.response;

import lombok.*;

@Getter
public class ExamResultListDto {
    private Long testId;
    private Long memberId;
    private String memberName;
    private String memberNumber;
    private String memberEmail;
    private Integer totalScore;
    private String examDueTime;
    private String submissionDate;

    @Builder
    private ExamResultListDto(Long testId, Long memberId, String memberName, String memberNumber, String memberEmail, Integer totalScore, String examDueTime, String submissionDate) {
        this.testId = testId;
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberNumber = memberNumber;
        this.memberEmail = memberEmail;
        this.totalScore = totalScore;
        this.examDueTime = examDueTime;
        this.submissionDate = submissionDate;
    }
}