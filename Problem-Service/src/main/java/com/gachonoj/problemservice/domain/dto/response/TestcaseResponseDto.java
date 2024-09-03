package com.gachonoj.problemservice.domain.dto.response;

import lombok.*;

@Getter
public class TestcaseResponseDto {
    private String testcaseInput;
    private String testcaseOutput;
    private String testcaseStatus; // Enum 이름을 String으로 받습니다.

    @Builder
    private TestcaseResponseDto(String testcaseInput, String testcaseOutput, String testcaseStatus) {
        this.testcaseInput = testcaseInput;
        this.testcaseOutput = testcaseOutput;
        this.testcaseStatus = testcaseStatus;
    }
}