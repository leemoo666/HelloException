package com.example.handler;

import com.example.bean.ResultResponse;
import com.example.bean.ReturnCode;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *请求路径错误
 */
@RestController
public class RequestExceptionHandler implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public ResultResponse errorPage() {
        return new ResultResponse(ReturnCode.UrlError);
    }
}
