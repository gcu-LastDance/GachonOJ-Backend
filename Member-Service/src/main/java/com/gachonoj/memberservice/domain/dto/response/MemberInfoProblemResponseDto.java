package com.gachonoj.memberservice.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class MemberInfoProblemResponseDto {
    private String memberNickname;
    private String memberIntroduce;
    private String memberImg;
    private Integer rating;
    private Integer memberRank;
    private Integer needRank;

    @Builder
    private MemberInfoProblemResponseDto(String memberNickname, String memberIntroduce, String memberImg, Integer rating, Integer memberRank, Integer needRank) {
        this.memberNickname = memberNickname;
        this.memberIntroduce = memberIntroduce;
        this.memberImg = memberImg;
        this.rating = rating;
        this.memberRank = memberRank;
        this.needRank = needRank;
    }
}
