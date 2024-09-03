package com.gachonoj.memberservice.domain.dto.response;

import com.gachonoj.memberservice.domain.constant.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class LoginResponseDto {
    private String memberImg;
    private Role memberRole;

    @Builder
    private LoginResponseDto(String memberImg, String memberRole) {
        this.memberImg = memberImg;
        this.memberRole = Role.fromLabel(memberRole);
    }
}
