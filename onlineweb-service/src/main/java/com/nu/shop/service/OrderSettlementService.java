

package com.nu.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nu.shop.bean.model.OrderSettlement;

/**
 *
 * @author hee on 2022/11/10.
 */
public interface OrderSettlementService extends IService<OrderSettlement> {

	/**
	 * 根据内部订单号更新order settlement
	 * @param outTradeNo 外部单号
	 * @param transactionId 支付单号
	 */
	void updateSettlementsByPayNo(String outTradeNo, String transactionId);
}
