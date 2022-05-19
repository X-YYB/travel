package com.young.commons.ex;

import com.young.commons.enums.IResultEnum;

/**
 * @Description: 自定义异常
 * @Author: yangyb
 * @Date:2022/2/27 19:12
 * Version: 1.0
 **/
public class OrderException extends RuntimeException {

    private int status;
    private String msg;

    public OrderException(int status, String message) {
        super(message);
        this.status = status;
        this.msg = message;
    }

    public OrderException(IResultEnum resultEnum) {
        super(resultEnum.message());
        this.status = resultEnum.status();
        this.msg = resultEnum.message();
    }


    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

}

