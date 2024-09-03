package com.gachonoj.problemservice.feign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
public class SubmissionExamResultInfoResponseDto {
    private List<SubmissionDetailDto> submissions;
}
