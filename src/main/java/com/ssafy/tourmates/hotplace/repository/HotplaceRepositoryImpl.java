package com.ssafy.tourmates.hotplace.repository;

import com.ssafy.tourmates.hotplace.Hotplace;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class HotplaceRepositoryImpl implements HotplaceRepository {

  private final HotplaceMapper hotplaceMapper;

  @Override
  public Hotplace save(Hotplace hotplace) {
    return hotplaceMapper.save(hotplace);
  }

  @Override
  public Optional<Hotplace> findById(Long id) {
    return hotplaceMapper.findById(id);
  }

  @Override
  public List<Hotplace> findAll() {
    return hotplaceMapper.findAll();
  }

  @Override
  public Optional<Hotplace> findByMemberId(Long memberId) {
    return hotplaceMapper.findByMemberId(memberId);
  }

  @Override
  public Optional<Hotplace> findByContentId(int contentId) {
    return hotplaceMapper.findByContentId(contentId);
  }

  @Override
  public Optional<Hotplace> findByContentTypeId(int contentTypeId) {
    return hotplaceMapper.findByContentTypeId(contentTypeId);
  }

  @Override
  public void update(Hotplace hotplace) {
    hotplaceMapper.update(hotplace);
  }

  @Override
  public void deleteById(Long id) {
    hotplaceMapper.deleteById(id);
  }
}
