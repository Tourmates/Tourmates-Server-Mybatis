package com.ssafy.tourmates.attractionInfo.repository.gugun;

import com.ssafy.tourmates.attractionInfo.service.gugun.Gugun;

import java.util.List;

public interface GugunRepository {
    List<Gugun> findBySidoCode(int sidoCode);
}
