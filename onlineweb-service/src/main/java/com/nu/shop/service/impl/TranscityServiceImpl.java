

package com.nu.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu.shop.bean.model.Transcity;
import com.nu.shop.dao.TranscityMapper;
import com.nu.shop.service.TranscityService;

/**
 *
 * @author hee on 2022/11/16.
 */
@Service
public class TranscityServiceImpl extends ServiceImpl<TranscityMapper, Transcity> implements TranscityService {

    @Autowired
    private TranscityMapper transcityMapper;

}
