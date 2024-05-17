package com.gachonoj.submissionservice.repository;

import com.gachonoj.submissionservice.domain.entity.Love;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoveRepository extends JpaRepository<Love,Long> {
    // 제출 id와 회원 id 존재하는지 조회
    boolean existsBySubmissionIdAndMemberId(Long submissionId, Long memberId);
    void deleteBySubmissionIdAndMemberId(Long submissionId, Long memberId);
}
