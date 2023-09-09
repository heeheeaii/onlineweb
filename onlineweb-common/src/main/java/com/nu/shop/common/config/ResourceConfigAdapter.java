package com.nu.shop.common.config;

import com.nu.shop.common.util.ImgUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author amin
 */
@Configuration
public class ResourceConfigAdapter implements WebMvcConfigurer {

    @Autowired
    private ImgUploadUtil imgUploadUtil;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/onlineweb/img/**").addResourceLocations("file:" + imgUploadUtil.getUploadPath());
    }
}
