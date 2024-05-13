package com.gachonoj.memberservice.domain.dto.response;

import com.gachonoj.memberservice.domain.constant.MemberLang;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberLangCountResponseDto {
    private MemberLang lang;
    private Long count;

}
