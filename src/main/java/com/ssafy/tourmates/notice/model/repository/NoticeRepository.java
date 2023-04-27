package com.ssafy.tourmates.notice.model.repository;

import com.ssafy.tourmates.notice.model.Notice;

public interface NoticeRepository {

    Long save(Notice notice);
}
