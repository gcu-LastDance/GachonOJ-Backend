package com.gachonoj.problemservice.domain.dto.response;

import lombok.*;

@Getter
public class QuestionResultDetailsResponseDto {
    private int questionSequence;
    private int questionScore;
    private Long problemId;
    private String problemTitle;
    private String problemContents;
    private boolean submissionStatus;
    private String submissionCode;

    @Builder
    private QuestionResultDetailsResponseDto(int questionSequence, int questionScore, Long problemId, String problemTitle, String problemContents, boolean submissionStatus, String submissionCode) {
        this.questionSequence = questionSequence;
        this.questionScore = questionScore;
        this.problemId = problemId;
        this.problemTitle = problemTitle;
        this.problemContents = problemContents;
        this.submissionStatus = submissionStatus;
        this.submissionCode = submissionCode;
    }
}
