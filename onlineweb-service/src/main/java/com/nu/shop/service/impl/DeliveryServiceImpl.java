

package com.nu.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu.shop.bean.model.Delivery;
import com.nu.shop.dao.DeliveryMapper;

import com.nu.shop.service.DeliveryService;

/**
 *
 * @author hee on 2022/11/26.
 */
@Service
public class DeliveryServiceImpl extends ServiceImpl<DeliveryMapper, Delivery> implements DeliveryService {

    @Autowired
    private DeliveryMapper deliveryMapper;

}
