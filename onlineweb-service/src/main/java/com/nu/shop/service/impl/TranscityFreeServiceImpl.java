

package com.nu.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu.shop.bean.model.TranscityFree;
import com.nu.shop.dao.TranscityFreeMapper;

import com.nu.shop.service.TranscityFreeService;

/**
 *
 * @author hee on 2022/12/20.
 */
@Service
public class TranscityFreeServiceImpl extends ServiceImpl<TranscityFreeMapper, TranscityFree> implements TranscityFreeService {

    @Autowired
    private TranscityFreeMapper transcityFreeMapper;

}
