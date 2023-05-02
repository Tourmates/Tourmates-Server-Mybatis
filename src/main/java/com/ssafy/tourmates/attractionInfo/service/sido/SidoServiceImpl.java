package com.ssafy.tourmates.attractionInfo.service.sido;

import com.ssafy.tourmates.attractionInfo.repository.sido.SidoRepository;
import com.ssafy.tourmates.attractionInfo.service.dto.SidoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SidoServiceImpl implements SidoService{

    private final SidoRepository sidoRepository;


    @Override
    public List<SidoDto> findAll() {
        List<Sido> sidoList = sidoRepository.findAll();

        return sidoList.stream()
                .map(sido -> new SidoDto(sido.getCode(), sido.getName()))
                .collect(Collectors.toList());
    }
}
