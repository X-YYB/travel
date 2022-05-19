package com.young.commons.enums;

/**
 * @Description: TODO
 * @Author: yangyb
 * @Date:2022/2/27 19:09
 * Version: 1.0
 **/
public enum ResultStatusEnumB implements IResultEnum {

    USER_PWR_STATUS("601", "100", "用户密码有误"),
    ORDER_ERROR_STATUS("602", "101", "订单有误");

    ResultStatusEnumB(String status, String bcode, String message) {
        this.status = Integer.parseInt(IResultEnum.B.concat(bcode).concat(status));
        this.message = message;
    }

    private int status;
    private String message;

    @Override
    public int status() {
        return this.status;
    }

    @Override
    public String message() {
        return this.message;
    }


}
