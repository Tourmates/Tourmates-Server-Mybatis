package com.ssafy.tourmates.attractionInfo.repository.sido;

import com.ssafy.tourmates.attractionInfo.service.sido.Sido;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SidoRepositoryImpl implements SidoRepository {

    private final SidoMapper sidoMapper;

    @Override
    public List<Sido> findAll() {
        return sidoMapper.findAll();
    }
}
