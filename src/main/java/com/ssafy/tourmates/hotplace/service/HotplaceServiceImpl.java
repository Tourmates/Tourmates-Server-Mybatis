package com.ssafy.tourmates.hotplace.service;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import com.ssafy.tourmates.attractionInfo.repository.AttractionInfoRepository;
import com.ssafy.tourmates.common.FileStore;
import com.ssafy.tourmates.common.exception.HotplaceNotFoundException;
import com.ssafy.tourmates.common.exception.MemberNotFoundException;
import com.ssafy.tourmates.hotplace.Hotplace;
import com.ssafy.tourmates.hotplace.repository.HotplaceRepository;
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
    public Long edit(ModifyHotplaceDto dto) {
        return null;
    }

    @Override
    public Long delete(Long hotplaceId) {
        hotplaceRepository.remove(hotplaceId);
        return hotplaceId;
    }
}
