package com.ssafy.tourmates.notice.model.service;

import com.ssafy.tourmates.common.exception.MemberNotFoundException;
import com.ssafy.tourmates.member.model.Member;
import com.ssafy.tourmates.member.model.repository.MemberRepository;
import com.ssafy.tourmates.notice.model.Notice;
import com.ssafy.tourmates.notice.model.repository.NoticeRepository;
import com.ssafy.tourmates.notice.model.service.dto.AddNoticeDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttribute;

@Service
public class NoticeServiceImpl implements NoticeService{

    private NoticeRepository noticeRepository;

    public NoticeServiceImpl(NoticeRepository noticeRepository){
        this.noticeRepository = noticeRepository;
    }

    @Override
    public Long add(AddNoticeDto dto,  Member loginMember) {

            Notice notice = Notice.builder()
                    .title(dto.getTitle())
                    .content(dto.getContent())
                    .top(dto.isTop())
                    .createBy(dto.getCreatedBy())
                    .lastModifiedBy(dto.getLastModifiedBy())
                    .build();

            return noticeRepository.save(notice);
    }

}
