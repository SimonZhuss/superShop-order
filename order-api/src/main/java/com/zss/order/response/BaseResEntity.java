package com.zss.order.response;

import com.zss.order.contants.OrderRespEnum;
import com.zss.order.exception.OrderException;

public class BaseResEntity {
    private String code;
    private String message;

    public BaseResEntity() {
        this.code = OrderRespEnum.SUCCESS.getCode();
        this.message = OrderRespEnum.SUCCESS.getMessage();
    }

    public BaseResEntity(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static BaseResEntity failure() {
        return new BaseResEntity(OrderRespEnum.BUSINESS_ERROR.getCode(), OrderRespEnum.BUSINESS_ERROR.getMessage());
    }
    
    public static BaseResEntity failure(String message) {
        return new BaseResEntity(OrderRespEnum.BUSINESS_ERROR.getCode(), message);
    }
    
    public static BaseResEntity failure(OrderRespEnum message) {
        return new BaseResEntity(message.getCode(), message.getMessage());
    }

    public static BaseResEntity failure(OrderException e) {
        return new BaseResEntity(e.getCode(), e.getMsg());
    }

    public static BaseResEntity success() {
        return new BaseResEntity(OrderRespEnum.SUCCESS.getCode(), OrderRespEnum.SUCCESS.getMessage());
    }

}
