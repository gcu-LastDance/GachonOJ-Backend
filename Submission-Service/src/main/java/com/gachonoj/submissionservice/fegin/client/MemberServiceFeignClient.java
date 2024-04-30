package com.gachonoj.submissionservice.fegin.client;

import com.gachonoj.submissionservice.fegin.dto.response.SubmissionMemberRankInfoResponseDto;
import lombok.Getter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Member-Service")
public interface MemberServiceFeignClient {
    // memberRank 조회
    @GetMapping("/member/{memberId}/rank")
    SubmissionMemberRankInfoResponseDto getMemberRank(@PathVariable Long memberId);
    // memberRank 갱신
    @PostMapping("/member/{memberId}/rank")
    Void updateMemberRank(@PathVariable Long memberId,@RequestBody Integer newRank);
}
