
package com.nu.shop.security.common.controller;

import com.nu.shop.common.response.ServerResponseEntity;
import com.nu.shop.security.common.bo.TokenInfoBO;
import com.nu.shop.security.common.dto.RefreshTokenDTO;
import com.nu.shop.security.common.manager.TokenStore;
import com.nu.shop.security.common.vo.TokenInfoVO;
import io.swagger.v3.oas.annotations.tags.Tag;
import cn.hutool.core.bean.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

/**
 * 
 * @date 2022/3/25 17:33
 */
@RestController
@Tag(name = "token")
public class TokenController {

    @Autowired
    private TokenStore tokenStore;


    @PostMapping("/token/refresh")
    public ServerResponseEntity<TokenInfoVO> refreshToken(@Valid @RequestBody RefreshTokenDTO refreshTokenDTO) {
        TokenInfoBO tokenInfoServerResponseEntity = tokenStore
                .refreshToken(refreshTokenDTO.getRefreshToken());
        return ServerResponseEntity
                .success(BeanUtil.copyProperties(tokenInfoServerResponseEntity, TokenInfoVO.class));
    }

}
