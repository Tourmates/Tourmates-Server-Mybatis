package com.ssafy.tourmates.hotplace.model.service;

import com.ssafy.tourmates.common.exception.MemberNotFoundException;
import com.ssafy.tourmates.hotplace.model.Hotplace;
import com.ssafy.tourmates.hotplace.model.repository.HotplaceRepository;
import com.ssafy.tourmates.hotplace.model.service.dto.AddHotplaceDto;
import com.ssafy.tourmates.hotplace.model.service.dto.ModifyHotplaceDto;
import com.ssafy.tourmates.member.model.Member;
import com.ssafy.tourmates.member.model.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HotplaceServiceImpl implements HotplaceService {

  private HotplaceRepository hotplaceRepository;
  private MemberRepository memberRepository;

  public HotplaceServiceImpl(HotplaceRepository hotplaceRepository,
      MemberRepository memberRepository) {
    this.hotplaceRepository = hotplaceRepository;
    this.memberRepository = memberRepository;
  }

  @Override
  public void add(AddHotplaceDto dto) {
    Member member = memberRepository.findById(dto.getMemberId())
        .orElseThrow(MemberNotFoundException::new);

    Hotplace hotplace = Hotplace.builder()
        .name(dto.getName())
        .desc(dto.getDesc())
        .visitedDate(dto.getVisitedDate())
        .uploadFileName(dto.getUploadFileName())
        .storeFileName(dto.getStoreFileName())
        .member(member)
        .contentId(dto.getContentId())
        .contentTypeId(dto.getContentTypeId())
        .build();

    hotplaceRepository.save(hotplace);

  }

  @Override
  public void modify(ModifyHotplaceDto dto) {
    Member member = memberRepository.findById(dto.getMemberId())
        .orElseThrow(MemberNotFoundException::new);

    Hotplace hotplace = Hotplace.builder()
        .hotPlaceId(dto.getId())
        .name(dto.getName())
        .desc(dto.getDesc())
        .visitedDate(dto.getVisitedDate())
        .uploadFileName(dto.getUploadFileName())
        .storeFileName(dto.getStoreFileName())
        .member(member)
        .contentId(dto.getContentId())
        .contentTypeId(dto.getContentTypeId())
        .build();

    hotplaceRepository.update(hotplace);
  }

  @Override
  public void delete(Long hotplaceId) {
    hotplaceRepository.deleteById(hotplaceId);
  }
}
