package com.example.bean;

public class ResultResponse {
    /**
     * 返回代码
     */
    private String code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object data;


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 默认构造，返回操作正确的返回代码和信息
     */
    public ResultResponse() {
        this.setCode("2000");
        this.setMessage("操作成功");
    }

    /**
     * 返回代码，这里需要在枚举中去定义
     * @param code
     */
    public ResultResponse(ReturnCode code) {
        this.setCode(code.val());
        this.setMessage(code.msg());
    }

    /**
     * 返回数据，默认返回正确的code和message
     * @param data
     */
    public ResultResponse(Object data) {
        this.setCode("2000");
        this.setMessage("操作成功");
        this.setData(data);
    }

    /**
     * 返回自定义的code，message，以及data
     *
     * @param code
     * @param message
     * @param data
     */
    public ResultResponse(ReturnCode code, String message, Object data) {
        this.setCode(code.val());
        this.setMessage(message);
        this.setData(data);
    }

    @Override
    public String toString() {
        return "ResultResponse{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
