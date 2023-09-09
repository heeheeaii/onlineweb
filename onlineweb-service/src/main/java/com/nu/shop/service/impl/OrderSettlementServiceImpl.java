

package com.nu.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu.shop.bean.model.OrderSettlement;
import com.nu.shop.dao.OrderSettlementMapper;
import com.nu.shop.service.OrderSettlementService;

/**
 *
 * @author hee on 2022/11/10.
 */
@Service
public class OrderSettlementServiceImpl extends ServiceImpl<OrderSettlementMapper, OrderSettlement> implements OrderSettlementService {

    @Autowired
    private OrderSettlementMapper orderSettlementMapper;

	@Override
	public void updateSettlementsByPayNo(String outTradeNo, String transactionId) {
		orderSettlementMapper.updateSettlementsByPayNo(outTradeNo, transactionId);
	}

}
