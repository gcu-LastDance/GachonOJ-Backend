package com.gachonoj.problemservice.feign.dto.response;

import com.gachonoj.problemservice.domain.entity.Testcase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
public class SubmissionProblemTestCaseResponseDto {
    private String input;
    private String output;

    @Builder
    private SubmissionProblemTestCaseResponseDto(String input, String output) {
        this.input = input;
        this.output = output;
    }
}
