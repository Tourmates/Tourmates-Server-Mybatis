package com.ssafy.tourmates.notice.model.service;

import com.ssafy.tourmates.member.model.Member;
import com.ssafy.tourmates.notice.model.Notice;
import com.ssafy.tourmates.notice.model.service.dto.AddNoticeDto;

public interface NoticeService {

    public Long add(AddNoticeDto dto, Member loginMember);
}
