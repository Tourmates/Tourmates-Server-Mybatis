package com.ssafy.tourmates.notice;

import com.ssafy.tourmates.common.exception.EditException;
import com.ssafy.tourmates.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static lombok.AccessLevel.*;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class Notice {

    private Long id;
    private String title;
    private String content;
    private boolean top;
    private Member createdBy;
    private Member lastModifiedBy;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

    @Builder
    public Notice(Long id, String title, String content, boolean top, Member createBy, Member lastModifiedBy, LocalDateTime createdDate, LocalDateTime lastModifiedDate){
        this.id = id;
        this.title = title;
        this.content = content;
        this.top = top;
        this.createdBy = createBy;
        this.lastModifiedBy = lastModifiedBy;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    //== 비즈니스 로직 ==//

    public void change(String newTitle, String newContent, boolean newTop){
        this.title = newTitle;
        this.content = newContent;
        this.top = newTop;
    }
}
