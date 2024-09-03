package com.gachonoj.submissionservice.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Getter
public class ExecuteRequestDto {
    @NotBlank
    private String code;
    @NotBlank
    private String language;
    // 추가로 넣는 테스트케이스
    private HashMap<String, String> testcase;

    @Builder
    public ExecuteRequestDto(String code, String language, HashMap<String, String> testcase) {
        this.code = code;
        this.language = language;
        this.testcase = testcase;
    }
}
