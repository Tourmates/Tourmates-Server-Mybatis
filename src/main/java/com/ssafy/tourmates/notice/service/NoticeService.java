package com.ssafy.tourmates.notice.service;

import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.notice.service.dto.AddNoticeDto;
import com.ssafy.tourmates.notice.service.dto.ModifyNoticeDto;

public interface NoticeService {

    public Long add(AddNoticeDto dto, Member loginMember);

    void checkAuthority(Member loginMember);

    ModifyNoticeDto getNotice(Long noticeId);

    Long edit(Long modifyId, ModifyNoticeDto dto);

    void delete(Long noticeId);
}
