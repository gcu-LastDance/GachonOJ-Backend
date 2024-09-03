package com.gachonoj.memberservice.feign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class SubmissionMemberRankInfoResponseDto {
    private Integer memberRank;
    private Integer memberRating;
    private Integer needRank;

    @Builder
    private SubmissionMemberRankInfoResponseDto(Integer memberRank, Integer memberRating, Integer needRank) {
        this.memberRank = memberRank;
        this.memberRating = memberRating;
        this.needRank = needRank;
    }
}
