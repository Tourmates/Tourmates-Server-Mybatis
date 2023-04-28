package com.ssafy.tourmates.notice.repository;

import com.ssafy.tourmates.notice.Notice;

import java.util.Optional;

public interface NoticeRepository {

    Long save(Notice notice);

    Optional<Notice> findById(Long noticeId);

    Long update(Notice notice);

    void deleteById(Long noticeId);
}
