package com.gachonoj.boardservice.repository;

import com.gachonoj.boardservice.domain.constant.InquiryStatus;
import com.gachonoj.boardservice.domain.entity.Inquiry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InquiryRepository extends JpaRepository<Inquiry,Long> {
    // 문의사항 목록 조회 관리자 페이지네이션
    Page<Inquiry> findAllByOrderByInquiryCreatedDateDesc(Pageable pageable);
    // 문의사항 목록 조회 사용자 페이지네이션
    Page<Inquiry> findByMemberIdOrderByInquiryCreatedDateDesc(Long memberId, Pageable pageable);
    // 관리자 대시보드 최근 답변되지않은 문의사항 목록 조회
    List<Inquiry> findTop5ByInquiryStatusOrderByInquiryCreatedDateDesc(InquiryStatus inquiryStatus);
}
