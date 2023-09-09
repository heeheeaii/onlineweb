

package com.nu.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu.shop.bean.model.TransfeeFree;
import com.nu.shop.dao.TransfeeFreeMapper;

import com.nu.shop.service.TransfeeFreeService;

/**
 *
 * @author hee on 2022/12/20.
 */
@Service
public class TransfeeFreeServiceImpl extends ServiceImpl<TransfeeFreeMapper, TransfeeFree> implements TransfeeFreeService {

    @Autowired
    private TransfeeFreeMapper transfeeFreeMapper;

}
