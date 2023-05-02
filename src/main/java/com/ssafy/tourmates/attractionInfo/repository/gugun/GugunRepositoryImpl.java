package com.ssafy.tourmates.attractionInfo.repository.gugun;

import com.ssafy.tourmates.attractionInfo.service.gugun.Gugun;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class GugunRepositoryImpl implements GugunRepository{

    private final GugunMapper gugunMapper;

    @Override
    public List<Gugun> findBySidoCode(int sidoCode) {

        return gugunMapper.findBySidoCode(sidoCode);
    }
}
