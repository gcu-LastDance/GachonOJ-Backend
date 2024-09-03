package com.gachonoj.memberservice.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class MemberInfoByAdminResponseDto {
    private String memberEmail;
    private String memberName;
    private String memberNumber;
    private String memberNickname;
    private String memberRole;

    @Builder
    private MemberInfoByAdminResponseDto(String memberEmail, String memberName, String memberNumber, String memberNickname, String memberRole) {
        this.memberEmail = memberEmail;
        this.memberName = memberName;
        this.memberNumber = memberNumber;
        this.memberNickname = memberNickname;
        this.memberRole = memberRole;
    }
}
