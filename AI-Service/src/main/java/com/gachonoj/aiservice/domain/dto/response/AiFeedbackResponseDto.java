package com.gachonoj.aiservice.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class AiFeedbackResponseDto {
    private Long problemId;
    private String problemTitle;
    private String memberNickname;
    private String code;
    private String aiContents;

    @Builder
    private AiFeedbackResponseDto(Long problemId, String problemTitle, String memberNickname, String code, String aiContents) {
        this.problemId = problemId;
        this.problemTitle = problemTitle;
        this.memberNickname = memberNickname;
        this.code = code;
        this.aiContents = aiContents;
    }
}
