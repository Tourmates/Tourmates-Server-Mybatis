package com.ssafy.tourmates.attractionInfo.service.gugun;

import com.ssafy.tourmates.attractionInfo.service.dto.GugunDto;

import java.util.List;

public interface GugunService {
    List<GugunDto> searchGuguns(int sidoCode);
}
