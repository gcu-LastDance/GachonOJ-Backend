package com.gachonoj.boardservice.domain.dto.response;

import com.gachonoj.boardservice.domain.entity.Notice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Getter
public class NoticeMainResponseDto {
    private Long noticeId;
    private String noticeTitle;
    private String memberNickname;
    private String noticeCreatedDate;

    @Builder
    private NoticeMainResponseDto(Notice notice,String noticeCreatedDate, String memberNickname) {
        this.noticeId = notice.getNoticeId();
        this.noticeTitle = notice.getNoticeTitle();
        this.noticeCreatedDate = noticeCreatedDate;
        this.memberNickname = memberNickname;
    }
}
