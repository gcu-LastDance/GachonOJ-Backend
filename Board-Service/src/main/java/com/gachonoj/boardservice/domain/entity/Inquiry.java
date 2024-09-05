package com.gachonoj.boardservice.domain.entity;

import com.gachonoj.boardservice.domain.constant.InquiryStatus;
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
public class Inquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inquiryId;
    private Long memberId;
    private String inquiryTitle;
    @Column(columnDefinition = "TEXT")
    private String inquiryContents;
    @Enumerated(EnumType.STRING)
    private InquiryStatus inquiryStatus = InquiryStatus.NONE;
    @CreatedDate
    private LocalDateTime inquiryCreatedDate;
    @LastModifiedDate
    private LocalDateTime inquiryUpdatedDate;
    @OneToOne(mappedBy = "inquiry", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Reply reply;

    public void updateInquiry(String inquiryTitle, String inquiryContents) {
        this.inquiryTitle = inquiryTitle;
        this.inquiryContents = inquiryContents;
    }

    public void updateInquiryStatus(InquiryStatus inquiryStatus) {
        this.inquiryStatus = inquiryStatus;
    }

    @Builder
    private Inquiry(Long memberId, String inquiryTitle, String inquiryContents) {
        this.memberId = memberId;
        this.inquiryTitle = inquiryTitle;
        this.inquiryContents = inquiryContents;
    }
}

