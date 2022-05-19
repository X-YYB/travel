package com.young.commons.ex;

import com.young.commons.enums.IResultEnum;

/**
 * @Description: 自定义异常
 * @Author: yangyb
 * @Date:2022/2/27 19:11
 * Version: 1.0
 **/
public class BussinessException extends RuntimeException {

    private int status;
    private String msg;


    public BussinessException(IResultEnum resultEnum) {
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
