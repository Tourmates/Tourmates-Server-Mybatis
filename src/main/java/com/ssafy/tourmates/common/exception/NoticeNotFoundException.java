package com.ssafy.tourmates.common.exception;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

public class NoticeNotFoundException extends IllegalArgumentException{

    public NoticeNotFoundException(){
        super();

    }
    public NoticeNotFoundException(String message){
        super(message);
    }

}
