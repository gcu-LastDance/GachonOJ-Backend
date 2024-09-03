package com.gachonoj.problemservice.feign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class ProblemMemberInfoResponseDto {
    private String memberNumber;
    private String memberName;
    private String memberEmail;
}
