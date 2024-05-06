package com.wsl.example.exception;

import com.wsl.example.util.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: wsl
 * @Since: 2024-4-20
 * @Version: 1.0
 * @Description: 自定义异常处理
 */
@ControllerAdvice
//@RestControllerAdvice
@Slf4j
public class CustomExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonData handler(Exception e) {
        log.error("[系统异常]{}", e);
        return JsonData.buildError(e.getMessage());
    }
}