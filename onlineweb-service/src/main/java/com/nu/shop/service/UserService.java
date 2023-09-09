

package com.nu.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nu.shop.bean.model.User;
import com.nu.shop.bean.param.UserRegisterParam;

/**
 *
 * @author hee on 2022/09/11.
 */
public interface UserService extends IService<User> {
    /**
     * 根据用户id获取用户信息
     * @param userId
     * @return
     */
    User getUserByUserId(String userId);

    /**
     * 校验验证码
     * @param userRegisterParam
     * @param checkRegisterSmsFlag
     */
    void validate(UserRegisterParam userRegisterParam, String checkRegisterSmsFlag);
}
