package com.ssafy.tourmates.hotplace.repository.impl;

import com.ssafy.tourmates.hotplace.Hotplace;

import java.util.List;
import java.util.Optional;

import com.ssafy.tourmates.hotplace.repository.HotplaceMapper;
import com.ssafy.tourmates.hotplace.repository.HotplaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class HotplaceRepositoryImpl implements HotplaceRepository {

    private final HotplaceMapper mapper;

    @Override
    public Hotplace save(Hotplace hotplace) {
        mapper.save(hotplace);
        return hotplace;
    }

    @Override
    public Optional<Hotplace> findById(Long hotplaceId) {
        return mapper.findById(hotplaceId);
    }

    @Override
    public Optional<Hotplace> findDetailById(Long hotplaceId) {
        return mapper.findDetailById(hotplaceId);
    }

    @Override
    public List<Hotplace> findAll() {
        return mapper.findAll();
    }

    @Override
    public List<Hotplace> findByCondition(int pageNum, int amount) {
        return mapper.findByCondition((pageNum - 1) * amount, amount);
    }

    @Override
    public List<Hotplace> findByMemberId(Long memberId, int pageNum, int amount) {
        return mapper.findMyByMemberId(memberId, (pageNum - 1) * amount, amount);
    }

    @Override
    public Optional<Hotplace> findByMemberId(Long memberId) {
        return Optional.empty();
    }

    @Override
    public Optional<Hotplace> findByContentId(int contentId) {
        return Optional.empty();
    }

    @Override
    public void update(Hotplace hotplace) {
        mapper.update(hotplace);
    }

    @Override
    public void remove(Long hotplaceId) {
        mapper.remove(hotplaceId);
    }
}
