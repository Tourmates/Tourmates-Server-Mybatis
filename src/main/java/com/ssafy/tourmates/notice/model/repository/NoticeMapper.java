package com.ssafy.tourmates.notice.model.repository;

import com.ssafy.tourmates.notice.model.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

@Mapper
public interface NoticeMapper {

    Notice save(@Param("notice") Notice notice);

    Optional<Notice> findById(@Param("noticeId") Long noticeId);

    void update(@Param("notice") Notice notice);

    void deleteById(@Param("noticeId") Long noticeId);
}
