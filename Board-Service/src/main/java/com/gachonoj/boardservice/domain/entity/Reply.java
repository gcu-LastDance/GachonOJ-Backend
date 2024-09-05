package com.gachonoj.boardservice.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inquiry_id")
    private Inquiry inquiry;
    @Column(columnDefinition = "TEXT")
    private String replyContents;
    @Column(nullable = false)
    @CreatedDate
    private LocalDateTime replyCreatedDate;
    @LastModifiedDate
    private LocalDateTime replyUpdatedDate;

    public Reply(Inquiry inquiry, String replyContents) {
        this.inquiry = inquiry;
        this.replyContents = replyContents;
    }
}
