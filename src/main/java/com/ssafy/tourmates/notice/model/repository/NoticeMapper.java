package com.ssafy.tourmates.notice.model.repository;

import com.ssafy.tourmates.notice.model.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NoticeMapper {

    Notice save(@Param("notice") Notice notice);
}
