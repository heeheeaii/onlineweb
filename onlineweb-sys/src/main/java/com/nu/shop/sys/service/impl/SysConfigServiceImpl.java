

package com.nu.shop.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nu.shop.sys.dao.SysConfigMapper;
import com.nu.shop.sys.model.SysConfig;
import com.nu.shop.sys.service.SysConfigService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author hee
 */
@Service("sysConfigService")
@AllArgsConstructor
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfig> implements SysConfigService {

	private final SysConfigMapper sysConfigMapper;

	@Override
	public void updateValueByKey(String key, String value) {
		sysConfigMapper.updateValueByKey(key, value);
	}

	@Override
	public void deleteBatch(Long[] ids) {
		sysConfigMapper.deleteBatch(ids);
	}

	@Override
	public String getValue(String key) {
		SysConfig config = sysConfigMapper.queryByKey(key);
		return config == null ? null : config.getParamValue();
	}
}
