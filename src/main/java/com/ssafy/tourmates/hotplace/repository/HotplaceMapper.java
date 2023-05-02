package com.ssafy.tourmates.hotplace.repository;

import com.ssafy.tourmates.hotplace.Hotplace;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HotplaceMapper {

    void save(Hotplace hotplace);

    Optional<Hotplace> findById(@Param("id") Long id);

    Optional<Hotplace> findDetailById(Long id);

    List<Hotplace> findAll();

    List<Hotplace> findByCondition(@Param("pageNum") int pageNum, @Param("amount") int amount);

    List<Hotplace> findMyByMemberId(@Param("memberId") Long memberId, @Param("pageNum") int pageNum, @Param("amount") int amount);

    Optional<Hotplace> findByMemberId(@Param("memberId") Long memberId);

    Optional<Hotplace> findByContentId(@Param("contentId") int contentId);

    Optional<Hotplace> findByContentTypeId(@Param("contentTypeId") int contentTypeId);

    void update(@Param("hotplace") Hotplace hotplace);

    void remove(@Param("id") Long id);
}
