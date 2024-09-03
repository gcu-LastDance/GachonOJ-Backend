package com.gachonoj.memberservice.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class MemberInfoRankingResponseDto {
    private String memberNickname;
    private Integer rating;
    private Integer solvedProblemCount;
    private Integer tryProblemCount;
    private Integer bookmarkProblemCount;

    @Builder
    private MemberInfoRankingResponseDto(String memberNickname, Integer rating, Integer solvedProblemCount, Integer tryProblemCount, Integer bookmarkProblemCount) {
        this.memberNickname = memberNickname;
        this.rating = rating;
        this.solvedProblemCount = solvedProblemCount;
        this.tryProblemCount = tryProblemCount;
        this.bookmarkProblemCount = bookmarkProblemCount;
    }
}
