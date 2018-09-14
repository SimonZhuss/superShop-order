package com.zss.order.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import com.zss.order.contants.OrderRespEnum;
import com.zss.order.response.ResponseEntity;

@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class OrderException extends RuntimeException{

	private static final long serialVersionUID = 5584943755890277011L;

	protected String code;
	protected String msg;
    
    public OrderException(ResponseEntity baseResEntity){
        if(baseResEntity == null){
            this.code = OrderRespEnum.SYSTEM_ERROR.getCode();
            this.msg = OrderRespEnum.SYSTEM_ERROR.getMessage();
        }else{
            this.code = baseResEntity.getCode();
            this.msg = baseResEntity.getMessage();
        }
    }

    public OrderException(OrderRespEnum marketRespEnum){
        if(marketRespEnum == null){
            this.code = OrderRespEnum.SYSTEM_ERROR.getCode();
            this.msg = OrderRespEnum.SYSTEM_ERROR.getMessage();
        }else{
            this.code = marketRespEnum.getCode();
            this.msg = marketRespEnum.getMessage();
        }
    }

    public OrderException(OrderRespEnum marketRespEnum, String msg){
        if(marketRespEnum == null){
            this.code = OrderRespEnum.SYSTEM_ERROR.getCode();
            this.msg = OrderRespEnum.SYSTEM_ERROR.getMessage();
        }else{
            this.code = marketRespEnum.getCode();
            this.msg = marketRespEnum.getMessage() + msg;
        }
    }

    public OrderException(String msg){
        this.code = OrderRespEnum.BUSINESS_ERROR.getCode();
        this.msg = msg;
    }
}
