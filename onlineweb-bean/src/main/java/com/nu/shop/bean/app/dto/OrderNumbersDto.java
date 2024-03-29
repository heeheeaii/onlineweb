

package com.nu.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author laoma
 */
@Data
public class OrderNumbersDto {

	@Schema(description = "多个订单号拼接的字符串" ,required=true)
	private String orderNumbers;

	public OrderNumbersDto(String orderNumbers) {
		this.orderNumbers = orderNumbers;
	}
	public OrderNumbersDto(){}
}
