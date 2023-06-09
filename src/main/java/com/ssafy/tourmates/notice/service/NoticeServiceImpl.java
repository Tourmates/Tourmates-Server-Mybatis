package com.ssafy.tourmates.notice.service;

import com.ssafy.tourmates.common.exception.AccessDeniedException;
import com.ssafy.tourmates.common.exception.NoticeNotFoundException;
import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.notice.Notice;
import com.ssafy.tourmates.notice.repository.NoticeRepository;
import com.ssafy.tourmates.notice.service.dto.AddNoticeDto;
import com.ssafy.tourmates.notice.service.dto.DetailNoticeDto;
import com.ssafy.tourmates.notice.service.dto.ModifyNoticeDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {

    private NoticeRepository noticeRepository;

    public NoticeServiceImpl(NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }

    @Override
    @Transactional
    public Long add(AddNoticeDto dto, Member loginMember) {

        Notice notice = Notice.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .top(dto.isTop())
                .createBy(dto.getCreatedBy())
                .lastModifiedBy(dto.getLastModifiedBy())
                .build();

        return noticeRepository.save(notice);
    }


    @Override
    @Transactional
    public void checkAuthority(Member loginMember) {

        if (loginMember.getAuthority().getKey().equals("CLIENT")) {
            throw new AccessDeniedException("공지는 관리자만 수정이 가능합니다.");
        }
    }

    @Override
    @Transactional(readOnly = true)
    public ModifyNoticeDto getModifyNotice(Long noticeId) {

        Notice notice = noticeRepository.findById(noticeId).orElseThrow(NoticeNotFoundException::new);

        return ModifyNoticeDto.builder()
                .id(noticeId)
                .title(notice.getTitle())
                .content(notice.getContent())
                .top(notice.isTop())
                .build();
    }

    @Override
    public DetailNoticeDto getDetailNotice(Long noticeId) {

        Notice notice = noticeRepository.findById(noticeId).orElseThrow(NoticeNotFoundException::new);

        return DetailNoticeDto.builder()
                .noticeId(noticeId)
                .title(notice.getTitle())
                .content(notice.getContent())
                .top(notice.isTop())
                .createdBy(notice.getCreatedBy())
                .lastModifiedBy(notice.getLastModifiedBy())
                .createdDate(notice.getCreatedDate())
                .lastModifiedDate(notice.getLastModifiedDate())
                .build();
    }

    @Override
    public List<DetailNoticeDto> getAllNotice(){
        List<Notice> noticeList = noticeRepository.findAll();

        List<DetailNoticeDto> detailNoticeDtoList = new ArrayList<>();

        for(Notice notice : noticeList){
            DetailNoticeDto detailNoticeDto = DetailNoticeDto.builder()
                            .noticeId(notice.getNoticeId())
                            .title(notice.getTitle())
                            .content(notice.getContent())
                            .top(notice.isTop())
                            .createdBy(notice.getCreatedBy())
                            .lastModifiedBy(notice.getLastModifiedBy())
                            .createdDate(notice.getCreatedDate())
                            .lastModifiedDate(notice.getLastModifiedDate())
                            .build();
            detailNoticeDtoList.add(detailNoticeDto);
        }

        return detailNoticeDtoList;
    }

    @Override
    @Transactional
    public Long edit(Long modifyId, ModifyNoticeDto dto) {

        Notice findNotice = noticeRepository.findById(modifyId).orElseThrow(NoticeNotFoundException::new);

        findNotice.change(dto.getTitle(), dto.getContent(), dto.isTop());

        return noticeRepository.update(findNotice);
    }

    @Override
    @Transactional
    public void delete(Long noticeId) {
        noticeRepository.deleteById(noticeId);
    }

}
