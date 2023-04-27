package com.ssafy.tourmates.notice.model.service;

import com.ssafy.tourmates.common.exception.AccessDeniedException;
import com.ssafy.tourmates.common.exception.MemberNotFoundException;
import com.ssafy.tourmates.common.exception.NoticeNotFoundException;
import com.ssafy.tourmates.member.model.Member;
import com.ssafy.tourmates.member.model.repository.MemberRepository;
import com.ssafy.tourmates.notice.model.Notice;
import com.ssafy.tourmates.notice.model.repository.NoticeRepository;
import com.ssafy.tourmates.notice.model.service.dto.AddNoticeDto;
import com.ssafy.tourmates.notice.model.service.dto.ModifyNoticeDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Optional;

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


    @Override
    public void checkAuthority(Member loginMember) {

        if(loginMember.getAuthority().getKey().equals("CLIENT")) {
            throw new AccessDeniedException("공지는 관리자만 수정이 가능합니다.");
        }
    }

    @Override
    public ModifyNoticeDto getNotice(Long noticeId) {

        Notice notice =  noticeRepository.findById(noticeId).orElseThrow(NoticeNotFoundException::new);

        return ModifyNoticeDto.builder()
                        .title(notice.getTitle())
                        .content(notice.getContent())
                        .top(notice.isTop())
                        .build();
    }

    @Override
    public Long edit(Long modifyId, ModifyNoticeDto dto) {

        Notice findNotice = noticeRepository.findById(modifyId).orElseThrow(NoticeNotFoundException::new);

        findNotice.changeTitle(findNotice.getTitle(), dto.getTitle());
        findNotice.changeContent(findNotice.getContent(), dto.getContent());
        findNotice.changeTop(findNotice.isTop(), dto.isTop());

        return noticeRepository.update(findNotice);
    }

}
