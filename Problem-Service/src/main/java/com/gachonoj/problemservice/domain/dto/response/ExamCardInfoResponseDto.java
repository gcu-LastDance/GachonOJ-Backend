package com.gachonoj.problemservice.domain.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExamCardInfoResponseDto {
    private Long examId;
    private String examTitle;
    private String memberNickname;
    private String examStartDate;
    private String examEndDate;
    private String examStatus;

    @Builder
    private ExamCardInfoResponseDto(Long examId, String memberNickname, String examTitle, String examStartDate, String examEndDate, String examStatus) {
        this.examId = examId;
        this.memberNickname = memberNickname;
        this.examTitle = examTitle;
        this.examStartDate = examStartDate;
        this.examEndDate = examEndDate;
        this.examStatus = examStatus;
    }
}
