package com.ssafy.tourmates.attractionInfo.service.sido;

import com.ssafy.tourmates.attractionInfo.repository.sido.SidoRepository;
import com.ssafy.tourmates.attractionInfo.service.dto.SidoDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class SidoServiceImpl implements SidoService{

    private final SidoRepository sidoRepository;

    @Override
    public List<SidoDto> findAll() {
        List<Sido> sidoList = sidoRepository.findAll();

        log.info("sidoList: {}", sidoList.size());

        return sidoList.stream()
                .map(sido -> new SidoDto(sido.getCode(), sido.getName()))
                .collect(Collectors.toList());
    }
}
