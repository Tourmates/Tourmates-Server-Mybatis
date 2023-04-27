package com.ssafy.tourmates.notice.model.repository;

import com.ssafy.tourmates.notice.model.Notice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class NoticeRepositoryIml implements NoticeRepository{

    private final NoticeMapper noticeMapper;

    @Override
    public Long save(Notice notice) {
        return noticeMapper.save(notice).getId();
    }
}
