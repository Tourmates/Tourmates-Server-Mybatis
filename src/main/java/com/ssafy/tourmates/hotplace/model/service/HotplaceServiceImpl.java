package com.ssafy.tourmates.hotplace.model.service;

import com.ssafy.tourmates.common.exception.HotplaceNotFoundException;
import com.ssafy.tourmates.common.exception.MemberNotFoundException;
import com.ssafy.tourmates.hotplace.model.Hotplace;
import com.ssafy.tourmates.hotplace.model.repository.HotplaceRepository;
import com.ssafy.tourmates.hotplace.model.service.dto.AddHotplaceDto;
import com.ssafy.tourmates.hotplace.model.service.dto.ModifyHotplaceDto;
import com.ssafy.tourmates.member.model.Member;
import com.ssafy.tourmates.member.model.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
  @Transactional
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
  @Transactional
  public void edit(ModifyHotplaceDto dto) {
    Member member = memberRepository.findById(dto.getMemberId())
        .orElseThrow(MemberNotFoundException::new);

    Hotplace findHotplace = hotplaceRepository.findById(dto.getId()).orElseThrow(HotplaceNotFoundException::new);

    findHotplace.changeName(findHotplace.getName(), dto.getName());
    findHotplace.changeDesc(findHotplace.getDesc(), dto.getDesc());
    findHotplace.changeVisitedDate(findHotplace.getVisitedDate(), dto.getVisitedDate());
    findHotplace.changeUploadFileName(findHotplace.getUploadFileName(), dto.getUploadFileName());

    hotplaceRepository.update(findHotplace);
  }

  @Override
  @Transactional
  public void delete(Long hotplaceId) {
    hotplaceRepository.deleteById(hotplaceId);
  }
}
