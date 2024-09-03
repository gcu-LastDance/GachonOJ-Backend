package com.gachonoj.submissionservice.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class ExamSubmitRequestDto {
    @NotNull
    private Long problemId;
    @NotBlank
    private String code;
    @NotBlank
    private String language;
}
