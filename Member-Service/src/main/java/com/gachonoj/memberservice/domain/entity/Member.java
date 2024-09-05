package com.gachonoj.memberservice.domain.entity;

import com.gachonoj.memberservice.domain.constant.MemberLang;
import com.gachonoj.memberservice.domain.constant.Role;
import com.gachonoj.memberservice.domain.dto.request.MemberLangRequestDto;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;
    @Column(nullable = false)
    private String memberEmail;
    @Column(nullable = false)
    private String memberPassword;
    @Column(nullable = false)
    private String memberName;
    private String memberNumber;
    @Enumerated(EnumType.STRING)
    private Role memberRole;
    private String memberImg;
    private String memberIntroduce;
    @Column(nullable = false)
    private String memberNickname;
    private Integer memberRank;
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime memberCreatedDate;
    @Enumerated(EnumType.STRING)
    private MemberLang memberLang;


    // 사용자 언어 설정
    public void updateMemberLang(MemberLangRequestDto memberLangRequestDto) {
        this.memberLang = memberLangRequestDto.getMemberLang();
    }
    // 사용자 정보 수정
    public void updateMemberInfo(String memberNickname, String memberName, String memberIntroduce, String memberImg) {
        this.memberNickname = memberNickname;
        this.memberName = memberName;
        this.memberIntroduce = memberIntroduce;
        this.memberImg = memberImg;
    }
    // 사용자 비밀번호 수정
    public void updateMemberPassword(String encode) {
        this.memberPassword = encode;
    }
    // 사용자 정보 수정 (관리자)
    public void updateMemberInfo(String memberNickname, String memberName, String memberNumber,Role role){
        this.memberNickname = memberNickname;
        this.memberName = memberName;
        this.memberNumber = memberNumber;
        this.memberRole = role;
    }

    public void updateMemberRank(Integer newRank) {
        this.memberRank = newRank;
    }
}
