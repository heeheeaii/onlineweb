

package com.nu.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nu.shop.bean.model.OrderItem;

import java.util.List;

/**
 *
 * @author hee on 2022/09/15.
 */
public interface OrderItemService extends IService<OrderItem> {

	/**
	 * 根据订单编号获取订单项
	 * @param orderNumber
	 * @return
	 */
	List<OrderItem> getOrderItemsByOrderNumber(String orderNumber);

}
