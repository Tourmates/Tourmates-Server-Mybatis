package com.ssafy.tourmates.notice.service.dto;

import com.ssafy.tourmates.member.Member;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DetailNoticeDto {

    private Long noticeId;
    private String title;
    private String content;
    private boolean top;
    private Member createdBy;
    private Member lastModifiedBy;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

    @Builder
    public DetailNoticeDto(Long noticeId, String title, String content, boolean top, Member createdBy, Member lastModifiedBy, LocalDateTime createdDate, LocalDateTime lastModifiedDate){
        this.noticeId = noticeId;
        this.title = title;
        this.content = content;
        this.top = top;
        this.createdBy = createdBy;
        this.lastModifiedBy = lastModifiedBy;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }
}