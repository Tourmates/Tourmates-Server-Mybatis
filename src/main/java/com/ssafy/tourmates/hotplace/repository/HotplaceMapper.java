package com.ssafy.tourmates.hotplace.repository;

import com.ssafy.tourmates.hotplace.Hotplace;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HotplaceMapper {

    void save(@Param("hotplace") Hotplace hotplace);

    Optional<Hotplace> findById(@Param("id") Long id);

    List<Hotplace> findAll();

    Optional<Hotplace> findByMemberId(@Param("memberId") Long memberId);

    Optional<Hotplace> findByContentId(@Param("contentId") int contentId);

    Optional<Hotplace> findByContentTypeId(@Param("contentTypeId") int contentTypeId);

    void update(@Param("hotplace") Hotplace hotplace);

    void deleteById(@Param("id") Long id);
}
