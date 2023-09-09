

package com.nu.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu.shop.bean.model.PickAddr;
import com.nu.shop.dao.PickAddrMapper;
import com.nu.shop.service.PickAddrService;

/**
 *
 * @author hee on 2022/10/17.
 */
@Service
public class PickAddrServiceImpl extends ServiceImpl<PickAddrMapper, PickAddr> implements PickAddrService {

    @Autowired
    private PickAddrMapper pickAddrMapper;


}
