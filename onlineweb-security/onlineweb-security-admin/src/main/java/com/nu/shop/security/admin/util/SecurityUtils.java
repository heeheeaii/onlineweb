
package com.nu.shop.security.admin.util;

import com.nu.shop.security.admin.model.OnlineWebSysUser;
import com.nu.shop.security.common.bo.UserInfoInTokenBO;
import com.nu.shop.security.common.util.AuthUserContext;
import lombok.experimental.UtilityClass;

/**
 *
 * @author hee
 */
@UtilityClass
public class SecurityUtils {
    /**
     * 获取用户
     */
    public OnlineWebSysUser getSysUser() {
        UserInfoInTokenBO userInfoInTokenBO = AuthUserContext.get();

        OnlineWebSysUser details = new OnlineWebSysUser();
        details.setUserId(Long.valueOf(userInfoInTokenBO.getUserId()));
        details.setEnabled(userInfoInTokenBO.getEnabled());
        details.setUsername(userInfoInTokenBO.getNickName());
        details.setAuthorities(userInfoInTokenBO.getPerms());
        details.setShopId(userInfoInTokenBO.getShopId());
        return details;
    }
}

