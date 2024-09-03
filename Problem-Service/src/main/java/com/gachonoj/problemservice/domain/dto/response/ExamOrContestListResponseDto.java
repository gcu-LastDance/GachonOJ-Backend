package com.gachonoj.problemservice.domain.dto.response;

import com.gachonoj.problemservice.domain.entity.Exam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class ExamOrContestListResponseDto {
    private Long examId;
    private String examTitle;
    private String examMemo;
    private String memberNickname;
    private String examStatus;
    private String examUpdatedDate;
    private String examCreatedDate;

    @Builder
    private ExamOrContestListResponseDto(Exam exam, String examUpdateDate, String examCreatedDate,String memberNickname) {
        this.examId = exam.getExamId();
        this.examTitle = exam.getExamTitle();
        this.examMemo = exam.getExamMemo();
        this.memberNickname = memberNickname;
        this.examStatus = exam.getExamStatus().getLabel();
        this.examUpdatedDate = examUpdateDate;
        this.examCreatedDate = examCreatedDate;
    }
}
