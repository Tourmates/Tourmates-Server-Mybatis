package com.ssafy.tourmates.common.model;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class TimeBaseEntity {

    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
