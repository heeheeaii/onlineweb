package com.nu.shop.security.admin.adapter;

import com.nu.shop.security.common.adapter.DefaultAuthConfigAdapter;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @date 2022/3/28 14:57
 */
@Component
public class ResourceServerAdapter extends DefaultAuthConfigAdapter {
    public static final List<String> EXCLUDE_PATH = Arrays.asList(
            "/webjars/**",
            "/swagger/**",
            "/v3/api-docs/**",
            "/doc.html",
            "/swagger-ui.html",
            "/swagger-resources/**",
            "/captcha/**",
            "/adminLogin",
            "/onlineweb/img/**");

    @Override
    public List<String> excludePathPatterns() {
        return EXCLUDE_PATH;
    }
}
