package com.gachonoj.memberservice.feign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class ProblemMemberInfoResponseDto {
    private String memberNumber;
    private String memberName;
    private String memberEmail;

    @Builder
    private ProblemMemberInfoResponseDto(String memberNumber, String memberName, String memberEmail) {
        this.memberNumber = memberNumber;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
    }
}
