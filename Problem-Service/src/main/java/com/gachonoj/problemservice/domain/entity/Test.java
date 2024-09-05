package com.gachonoj.problemservice.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testId;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "exam_id", nullable = false)
    private Exam exam;
    @Column(nullable = false)
    private Long memberId;
    private Integer testScore;
    private LocalDateTime testStartDate;
    private LocalDateTime testEndDate;
}
