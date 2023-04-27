package com.ssafy.tourmates.common.exception;

import com.ssafy.tourmates.hotplace.model.Hotplace;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class HotplaceNotFoundException extends RuntimeException{

    public HotplaceNotFoundException(String message){
        super(message);
    }
}
