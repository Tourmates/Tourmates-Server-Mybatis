package com.ssafy.tourmates.notice.model.repository;

import com.ssafy.tourmates.notice.model.Notice;

import java.util.Optional;

public interface NoticeRepository {

    Long save(Notice notice);

    Optional<Notice> findById(Long noticeId);

    Long update(Notice notice);


}
