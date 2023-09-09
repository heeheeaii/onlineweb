package com.nu.shop.security.admin.dto;

import com.nu.shop.security.common.dto.AuthenticationDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 验证码登录
 * 
 * @date 2022/3/28 14:57
 */
@Data
public class CaptchaAuthenticationDTO extends AuthenticationDTO {

    @Schema(description = "验证码" , required = true)
    private String captchaVerification;
}
