
package com.nu.shop.security.api.util;

import com.nu.shop.common.util.HttpContextUtils;
import com.nu.shop.security.api.model.OnlineWebUser;
import com.nu.shop.security.common.bo.UserInfoInTokenBO;
import com.nu.shop.security.common.util.AuthUserContext;
import lombok.experimental.UtilityClass;

/**
 * @author hee
 */
@UtilityClass
public class SecurityUtils {

    private static final String USER_REQUEST = "/p/";

    /**
     * 获取用户
     */
    public OnlineWebUser getUser() {
        if (!HttpContextUtils.getHttpServletRequest().getRequestURI().startsWith(USER_REQUEST)) {
            // 用户相关的请求，应该以/p开头！！！
            throw new RuntimeException("yami.user.request.error");
        }
        UserInfoInTokenBO userInfoInTokenBO = AuthUserContext.get();

        OnlineWebUser onlineWebUser = new OnlineWebUser();
        onlineWebUser.setUserId(userInfoInTokenBO.getUserId());
        onlineWebUser.setBizUserId(userInfoInTokenBO.getBizUserId());
        onlineWebUser.setEnabled(userInfoInTokenBO.getEnabled());
        onlineWebUser.setShopId(userInfoInTokenBO.getShopId());
        onlineWebUser.setStationId(userInfoInTokenBO.getOtherId());
        return onlineWebUser;
    }
}
