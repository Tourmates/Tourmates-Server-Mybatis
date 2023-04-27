package com.ssafy.tourmates.notice.model.service.dto;

import com.ssafy.tourmates.member.model.Member;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Data
@NoArgsConstructor(access = PROTECTED)
public class AddNoticeDto {

    private String title;
    private String content;
    private boolean top;
    private Member createdBy;
    private Member lastModifiedBy;


    @Builder
    public AddNoticeDto(String title, String content, boolean top, Member createdBy, Member lastModifiedBy){
        this.title = title;
        this.content = content;
        this.top = top;
        this.createdBy = createdBy;
        this.lastModifiedBy = lastModifiedBy;
    }
}
