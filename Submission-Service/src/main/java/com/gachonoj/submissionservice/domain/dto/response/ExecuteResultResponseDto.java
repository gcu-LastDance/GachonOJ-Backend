package com.gachonoj.submissionservice.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class ExecuteResultResponseDto {
    private String output;
    private String result;

    @Builder
    private ExecuteResultResponseDto(String output, String result) {
        this.output = output;
        this.result = result;
    }
}
