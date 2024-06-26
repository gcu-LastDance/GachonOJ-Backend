package com.gachonoj.memberservice.domain.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;

@Getter
public class CreateMemberRequestDto {
    @Email
    @NotEmpty
    private String memberEmail;
    @NotBlank
    private String memberName;
    private String memberNumber;
    @NotBlank
    private String memberPassword;
    @NotBlank
    private String memberPasswordConfirm;
    @NotBlank
    private String memberNickname;
    @NotBlank
    private String memberRole;
}
