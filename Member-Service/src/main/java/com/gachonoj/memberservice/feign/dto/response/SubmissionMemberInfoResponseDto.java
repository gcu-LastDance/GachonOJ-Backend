package com.gachonoj.memberservice.feign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class SubmissionMemberInfoResponseDto {
    private Integer solvedProblemCount;
    private Integer tryProblemCount;
}
