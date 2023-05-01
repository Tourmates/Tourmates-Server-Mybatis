package com.ssafy.tourmates.hotplace.service.impl;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import com.ssafy.tourmates.attractionInfo.repository.AttractionInfoRepository;
import com.ssafy.tourmates.common.FileStore;
import com.ssafy.tourmates.common.exception.HotplaceNotFoundException;
import com.ssafy.tourmates.common.exception.MemberNotFoundException;
import com.ssafy.tourmates.hotplace.Hotplace;
import com.ssafy.tourmates.hotplace.repository.HotplaceRepository;
import com.ssafy.tourmates.hotplace.service.HotplaceService;
import com.ssafy.tourmates.hotplace.service.dto.AddHotplaceDto;
import com.ssafy.tourmates.hotplace.service.dto.ModifyHotplaceDto;
import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class HotplaceServiceImpl implements HotplaceService {

    private final HotplaceRepository hotplaceRepository;
    private final MemberRepository memberRepository;
    private final AttractionInfoRepository attractionInfoRepository;


    @Override
    public Long registerHotplace(String loginId, Integer contentId, AddHotplaceDto dto) {
        Member findMember = memberRepository.findByLoginId(loginId)
                .orElseThrow(NoSuchElementException::new);

        AttractionInfo findContent = attractionInfoRepository.findById(contentId)
                .orElseThrow(NoSuchElementException::new);

        Hotplace hotplace = Hotplace.builder()
                .tag(dto.getTag())
                .title(dto.getTitle())
                .content(dto.getContent())
                .visitedDate(dto.getVisitedDate())
                .uploadFile(null)
                .member(findMember)
                .info(findContent)
                .build();

        Hotplace savedHotplace = hotplaceRepository.save(hotplace);
        return savedHotplace.getId();
    }

    @Override
    public Long increaseHit(Long hotplaceId) {
        Hotplace findHotplace = hotplaceRepository.findById(hotplaceId)
                .orElseThrow(NoSuchElementException::new);

        findHotplace.increaseHit();
        return findHotplace.getId();
    }

    @Override
    public Long increaseVote(Long hotplaceId, String loginId) {
        Hotplace findHotplace = hotplaceRepository.findById(hotplaceId)
                .orElseThrow(NoSuchElementException::new);

        findHotplace.increaseVote();
        return findHotplace.getId();
    }

    @Override
    public Long editHotplace(Long hotplaceId, String loginId, ModifyHotplaceDto dto) {
        Hotplace findHotplace = hotplaceRepository.findById(hotplaceId)
                .orElseThrow(NoSuchElementException::new);

        findHotplace.changeHotplace(dto.getTag(), dto.getTitle(), dto.getContent(), dto.getVisitedDate(), null);
        hotplaceRepository.update(findHotplace);
        return findHotplace.getId();
    }


    @Override
    public Long removeHotplace(Long hotplaceId) {
        hotplaceRepository.remove(hotplaceId);
        return hotplaceId;
    }
}
