package com.gachonoj.problemservice.domain.dto.response;

import com.gachonoj.problemservice.domain.entity.Problem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProblemListResponseDto {
    private Long problemId;
    private String problemTitle;
    private String problemDiff;
    private String problemClass;
    private Integer correctPeople;
    private String correctRate;
    private Boolean isBookmarked;

    public ProblemListResponseDto(Problem problem, Integer correctPeople, Double correctRate) {
        this.problemId = problem.getProblemId();
        this.problemTitle = problem.getProblemTitle();
        this.problemDiff = problem.getProblemDiff().toString() + "단계";
        this.problemClass = problem.getProblemClass().getLabel();
        this.correctPeople = correctPeople;
        this.correctRate = String.format("%.2f", correctRate);
        this.isBookmarked = false;
    }
}
