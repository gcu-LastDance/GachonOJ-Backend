package com.gachonoj.memberservice.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class MemberInfoTestResponseDto {
    private Long memberId;
    private String memberImg;
    private String memberName;
    private String memberNumber;
    private String memberEmail;

    @Builder
    private MemberInfoTestResponseDto(Long memberId, String memberImg, String memberName, String memberNumber, String memberEmail) {
        this.memberId = memberId;
        this.memberImg = memberImg;
        this.memberName = memberName;
        this.memberNumber = memberNumber;
        this.memberEmail = memberEmail;
    }
}
