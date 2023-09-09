

package com.nu.shop.common.config;

import cn.hutool.crypto.symmetric.AES;
import com.nu.shop.common.bean.AliDaYu;
import com.nu.shop.common.bean.ImgUpload;
import com.nu.shop.common.bean.Qiniu;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author laoma
 */
@Configuration
@AllArgsConstructor
public class OnlineWebBeanConfig {

	private final OnlineWebBasicConfig onlineWebBasicConfig;

    @Bean
    public Qiniu qiniu() {
    	return onlineWebBasicConfig.getQiniu();
    }

    @Bean
    public AES tokenAes() {
    	return new AES(onlineWebBasicConfig.getTokenAesKey().getBytes());
    }

    @Bean
    public AliDaYu aLiDaYu () {
    	return onlineWebBasicConfig.getALiDaYu();
    }

    @Bean
    public ImgUpload imgUpload() {
        return onlineWebBasicConfig.getImgUpload();
    }
}
