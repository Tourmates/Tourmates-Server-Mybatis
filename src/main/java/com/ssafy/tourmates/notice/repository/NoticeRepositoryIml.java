package com.ssafy.tourmates.notice.repository;

import com.ssafy.tourmates.notice.Notice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class NoticeRepositoryIml implements NoticeRepository{

    private final NoticeMapper noticeMapper;

    @Override
    public Long save(Notice notice) {
        noticeMapper.save(notice);
        return notice.getId();
    }

    @Override
    public Optional<Notice> findById(Long noticeId) {
        return noticeMapper.findById(noticeId);
    }

    @Override
    public Long update(Notice notice) {
        noticeMapper.update(notice);

        return notice.getId();
    }

    @Override
    public void deleteById(Long noticeId) {
        noticeMapper.deleteById(noticeId);
    }
}
