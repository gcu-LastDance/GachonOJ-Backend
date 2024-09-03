package com.gachonoj.memberservice.domain.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class MemberInfoResponseDto {
    private String memberEmail;
    private String memberName;
    private String memberNumber;
    private String memberIntroduce;
    private String memberNickname;
    private String memberImg;
    private Integer rating;

    @Builder
    private MemberInfoResponseDto(String memberEmail, String memberName, String memberNumber, String memberIntroduce, String memberNickname, String memberImg, Integer rating) {
        this.memberEmail = memberEmail;
        this.memberName = memberName;
        this.memberNumber = memberNumber;
        this.memberIntroduce = memberIntroduce;
        this.memberNickname = memberNickname;
        this.memberImg = memberImg;
        this.rating = rating;
    }
}
