

package com.nu.shop.dao;

import org.apache.ibatis.annotations.Param;

import com.nu.shop.bean.model.SmsLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author laoma
 */
public interface SmsLogMapper extends BaseMapper<SmsLog> {
	/**
	 * 根据手机号和短信类型失效短信
	 * @param mobile
	 * @param type
	 */
	void invalidSmsByMobileAndType(@Param("mobile") String mobile, @Param("type") Integer type);
}
