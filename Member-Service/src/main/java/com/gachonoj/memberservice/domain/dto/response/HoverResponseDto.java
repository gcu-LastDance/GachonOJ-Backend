package com.gachonoj.memberservice.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class HoverResponseDto {
    private String memberEmail;
    private String memberNickname;
    private Integer rating;

    @Builder
    private HoverResponseDto(String memberEmail, String memberNickname, Integer rating) {
        this.memberEmail = memberEmail;
        this.memberNickname = memberNickname;
        this.rating = rating;
    }
}
