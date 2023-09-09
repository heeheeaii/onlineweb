

package com.nu.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nu.shop.bean.model.Message;
import com.nu.shop.dao.MessageMapper;
import com.nu.shop.service.MessageService;

/**
 *
 * @author hee on 2022/10/15.
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

}
