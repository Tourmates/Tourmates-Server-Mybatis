package com.ssafy.tourmates.notice.model.service;

import com.ssafy.tourmates.member.model.Member;
import com.ssafy.tourmates.notice.model.Notice;
import com.ssafy.tourmates.notice.model.service.dto.AddNoticeDto;
import com.ssafy.tourmates.notice.model.service.dto.ModifyNoticeDto;

public interface NoticeService {

    public Long add(AddNoticeDto dto, Member loginMember);

    void checkAuthority(Member loginMember);

    ModifyNoticeDto getNotice(Long noticeId);
}
