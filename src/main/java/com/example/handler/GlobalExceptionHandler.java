package com.example.handler;

import com.example.bean.ResultResponse;
import com.example.config.PropertiesConfig;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


/**
 * 全局异常处理类
 *
 * 用于全局返回json，如需返回ModelAndView请使用ControllerAdvice
 * 继承了ResponseEntityExceptionHandler，对于一些类似于请求方式异常的异常进行捕获
 */
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    /**
     * 重写handleExceptionInternal，自定义处理过程
     **/
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        //这里将异常直接传给handlerException()方法进行处理，返回值为OK保证友好的返回，而不是出现500错误码。
        return new ResponseEntity<>(handlerException(ex), HttpStatus.OK);
    }

    /**
     * 异常捕获
     * @param e 捕获的异常
     * @return 封装的返回对象
     **/
    @ExceptionHandler(Exception.class)
    public ResultResponse handlerException(Throwable e) {
        ResultResponse response = new ResultResponse();
        String errorName = e.getClass().getName();
        errorName = errorName.substring(errorName.lastIndexOf(".") + 1);
        //如果没有定义异常，而是直接抛出一个运行时异常，需要进入以下分支
        if (e.getClass() == RuntimeException.class) {
            response.setMessage("RuntimeException");
            response.setCode("4000");
        } else {
            response.setMessage(errorName);
            response.setCode("3000");
        }
        return response;
    }
}