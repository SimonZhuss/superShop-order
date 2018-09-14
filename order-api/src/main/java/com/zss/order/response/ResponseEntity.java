package com.zss.order.response;

import com.zss.order.contants.OrderRespEnum;

/**
 * 服务返回实体公共类
 */
@SuppressWarnings("rawtypes")
public class ResponseEntity<T> extends BaseResEntity{

	/**
	 * 数据体
	 */
	private Object data;

	public ResponseEntity(String code, String message) {
		new BaseResEntity(code,message);
	}

	public ResponseEntity(OrderRespEnum marketRespEnum) {
		new BaseResEntity(marketRespEnum.getCode(),marketRespEnum.getMessage());
	}
	
	public  ResponseEntity(OrderRespEnum marketRespEnum, T data) {
		new BaseResEntity(marketRespEnum.getCode(),marketRespEnum.getMessage());
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static ResponseEntity failure(String msg) {
		 return new ResponseEntity(OrderRespEnum.BUSINESS_ERROR.getCode(), msg);
	}
	
	public static ResponseEntity failure() {
		return new ResponseEntity(OrderRespEnum.BUSINESS_ERROR.getCode(), OrderRespEnum.BUSINESS_ERROR.getMessage());
	}
	
	public static ResponseEntity failure(OrderRespEnum e) {
		 return new ResponseEntity(e.getCode(), e.getMessage());
	}
	
	public static ResponseEntity success() {
		 return new ResponseEntity(OrderRespEnum.SUCCESS.getCode(), OrderRespEnum.SUCCESS.getMessage());
	}
	
	public static <T> ResponseEntity<T> success(T data) {
	   return new ResponseEntity<T>(OrderRespEnum.SUCCESS, data);
	}
	
	public static boolean isSuccess(ResponseEntity responseEntity){
        return responseEntity != null && OrderRespEnum.SUCCESS.getCode().equals(responseEntity.getCode()) && responseEntity.getData() != null;
    }
}
