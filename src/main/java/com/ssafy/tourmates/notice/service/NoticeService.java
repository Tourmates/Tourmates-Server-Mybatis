package com.ssafy.tourmates.notice.service;

import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.notice.service.dto.AddNoticeDto;
import com.ssafy.tourmates.notice.service.dto.DetailNoticeDto;
import com.ssafy.tourmates.notice.service.dto.ModifyNoticeDto;

import java.util.List;

public interface NoticeService {

    public Long add(AddNoticeDto dto, Member loginMember);

    void checkAuthority(Member loginMember);

    ModifyNoticeDto getModifyNotice(Long noticeId);

    DetailNoticeDto getDetailNotice(Long noticeId);

    List<DetailNoticeDto> getAllNotice();

    Long edit(Long modifyId, ModifyNoticeDto dto);

    void delete(Long noticeId);
}
