package com.ssafy.tourmates.common.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class HotplaceNotFoundException extends RuntimeException {

    public HotplaceNotFoundException(String message) {
        super(message);
    }
}
