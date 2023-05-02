package com.ssafy.tourmates.hotplace.repository;

import com.ssafy.tourmates.hotplace.Hotplace;

import java.util.List;
import java.util.Optional;

public interface HotplaceRepository {

    Hotplace save(Hotplace hotplace);

    Optional<Hotplace> findById(Long hotplaceId);

    List<Hotplace> findAll();

    List<Hotplace> findByCondition(int pageNum, int amount);

    Optional<Hotplace> findByMemberId(Long memberId);

    Optional<Hotplace> findByContentId(int contentId);

    void update(Hotplace hotplace);

    void remove(Long hotplaceId);
}
