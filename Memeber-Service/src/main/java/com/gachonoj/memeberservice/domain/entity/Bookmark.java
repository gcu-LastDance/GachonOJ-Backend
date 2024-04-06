package com.gachonoj.memeberservice.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
public class Bookmark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookmarkId;
    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;
    private Long problemId;
}