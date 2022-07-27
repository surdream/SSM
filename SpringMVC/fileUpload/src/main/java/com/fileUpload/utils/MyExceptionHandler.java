package com.fileUpload.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice
public class MyExceptionHandler {

//    @ExceptionHandler(NumberFormatException.class)
    public String nullHandler(){
        return "/nullHandler.jsp";
    }

//    @ExceptionHandler(NumberFormatException.class)
    public String formatHandler(){
        return "/NumberFormatException.jsp";
    }
}
