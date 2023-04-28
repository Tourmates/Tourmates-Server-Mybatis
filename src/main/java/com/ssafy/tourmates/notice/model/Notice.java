package com.ssafy.tourmates.notice.model;

import com.ssafy.tourmates.common.exception.EditException;
import com.ssafy.tourmates.member.model.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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

    public void changeTitle(String oldTitle, String newTitle) {
        if(!this.title.equals(oldTitle)){
            throw new EditException();
        }
        this.title = newTitle;
    }

    public void changeContent(String oldContent, String newContent) {
        if(!this.title.equals(oldContent)){
            throw new EditException();
        }
        this.title = newContent;
    }

    public void changeTop(boolean oldTop, boolean newTop){
        if(!this.top == oldTop){
            throw new EditException();
        }
        this.top = newTop;
    }
}
