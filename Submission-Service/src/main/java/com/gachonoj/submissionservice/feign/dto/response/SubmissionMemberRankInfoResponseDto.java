package com.gachonoj.submissionservice.feign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class SubmissionMemberRankInfoResponseDto {
    private Integer memberRank;
    private Integer memberRating;
    private Integer needRank;
}
