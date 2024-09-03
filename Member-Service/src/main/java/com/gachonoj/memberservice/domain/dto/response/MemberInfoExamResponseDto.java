package com.gachonoj.memberservice.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class MemberInfoExamResponseDto {
    private String memberNickname;
    private Integer rating;
    private String memberName;
    private String memberNumber;

    @Builder
    private MemberInfoExamResponseDto(String memberNickname, Integer rating, String memberName, String memberNumber) {
        this.memberNickname = memberNickname;
        this.rating = rating;
        this.memberName = memberName;
        this.memberNumber = memberNumber;
    }
}
