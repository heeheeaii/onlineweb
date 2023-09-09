

package com.nu.shop.service;

import com.nu.shop.bean.app.param.PayParam;
import com.nu.shop.bean.pay.PayInfoDto;

import java.util.List;

/**
 * @author hee on 2022/09/15.
 */
public interface PayService {

    /**
     * 支付
     * @param userId
     * @param payParam
     * @return
     */
    PayInfoDto pay(String userId, PayParam payParam);

    /**
     * 支付成功
     * @param payNo
     * @param bizPayNo
     * @return
     */
    List<String> paySuccess(String payNo, String bizPayNo);

}
