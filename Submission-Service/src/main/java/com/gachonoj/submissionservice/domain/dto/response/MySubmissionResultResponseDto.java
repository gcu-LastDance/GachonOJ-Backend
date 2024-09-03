package com.gachonoj.submissionservice.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class MySubmissionResultResponseDto {
    private String memberNickname;
    private String problemTitle;
    private String submissionCode;

    @Builder
    private MySubmissionResultResponseDto(String memberNickname, String problemTitle, String submissionCode) {
        this.memberNickname = memberNickname;
        this.problemTitle = problemTitle;
        this.submissionCode = submissionCode;
    }
}
