package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "response.properties" })
public class PropertiesConfig {

    @Value("${SUCCESS_CODE}")
    public String SUCCESS_CODE;
    @Value("${SUCCESS_MSG}")
    public String SUCCESS_MSG;

    @Value("${FAIL_CODE}")
    public String FAIL_CODE;
    @Value("${FAIL_MSG}")
    public String FAIL_MSG;

    @Value("${NPE_CODE}")
    public String NPE_CODE;
    @Value("${NPE_MSG}")
    public String NPE_MSG;

    @Value("${RTE_CODE}")
    public String RTE_CODE;
    @Value("${RTE_MSG}")
    public String RTE_MSG;

    @Value("${UE_CODE}")
    public String UE_CODE;
    @Value("${UE_MSG}")
    public String UE_MSG;

    @Value("${REQUEST_METHOD_UNSUPPORTED_CODE}")
    public String REQUEST_METHOD_UNSUPPORTED_CODE;
    @Value("${REQUEST_METHOD_UNSUPPORTED_MSG}")
    public String REQUEST_METHOD_UNSUPPORTED_MSG;

    @Value("${BIND_EXCEPTION_CODE}")
    public String BIND_EXCEPTION_CODE;
    @Value("${BIND_EXCEPTION_MSG}")
    public String BIND_EXCEPTION_MSG;
}
