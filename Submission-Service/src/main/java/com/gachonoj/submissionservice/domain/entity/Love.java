package com.gachonoj.submissionservice.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Love {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loveId;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "submission_id", nullable = false)
    private Submission submission;
    @Column(nullable = false)
    private Long memberId;

    @Builder
    private Love(Submission submission, Long memberId) {
        this.submission = submission;
        this.memberId = memberId;
    }
}
