package com.ssafy.tourmates.hotplace.repository;

import com.ssafy.tourmates.hotplace.Hotplace;

import java.util.List;
import java.util.Optional;

public interface HotplaceRepository {

    Hotplace save(Hotplace hotplace);

    Optional<Hotplace> findById(Long id);

    List<Hotplace> findAll();

    Optional<Hotplace> findByMemberId(Long memberId);

    Optional<Hotplace> findByContentId(int contentId);

    Optional<Hotplace> findByContentTypeId(int contentTypeId);

    void update(Hotplace hotplace);

    void deleteById(Long id);

}
