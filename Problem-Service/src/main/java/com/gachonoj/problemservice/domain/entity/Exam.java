package com.gachonoj.problemservice.domain.entity;

import com.gachonoj.problemservice.domain.constant.ExamStatus;
import com.gachonoj.problemservice.domain.constant.ExamType;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)  // examCreatedDate를 받기 위한 어노테이션
@NoArgsConstructor
@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examId;
    @Column(nullable = false)
    private Long memberId;
    private String examTitle;
    @Column(columnDefinition = "TEXT")
    private String examContents;
    @CreatedDate
    private LocalDateTime examCreatedDate;
    @LastModifiedDate
    private LocalDateTime examUpdateDate;
    private LocalDateTime examStartDate;
    private LocalDateTime examEndDate;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ExamStatus examStatus;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ExamType examType;
    private String examMemo;
    private String examNotice;
    private Integer examDueTime;
    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Test> tests;

    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> questions;

    @Builder
    private Exam(Long memberId, String examTitle, String examContents, LocalDateTime examStartDate, LocalDateTime examEndDate, ExamStatus examStatus, ExamType examType, String examMemo, String examNotice, Integer examDueTime) {
        this.memberId = memberId;
        this.examTitle = examTitle;
        this.examContents = examContents;
        this.examStartDate = examStartDate;
        this.examEndDate = examEndDate;
        this.examStatus = examStatus;
        this.examType = examType;
        this.examMemo = examMemo;
        this.examNotice = examNotice;
        this.examDueTime = examDueTime;
        this.tests = new ArrayList<>();
        this.questions = new ArrayList<>();
    }
}