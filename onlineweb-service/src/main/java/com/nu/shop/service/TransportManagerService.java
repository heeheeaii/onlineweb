

package com.nu.shop.service;

import com.nu.shop.bean.app.dto.ProductItemDto;
import com.nu.shop.bean.model.UserAddr;

/**
 * @author laoma
 */
public interface TransportManagerService {
	/**
	 * 计算运费
	 * @param productItem
	 * @param userAddr
	 * @return
	 */
	Double calculateTransfee(ProductItemDto productItem, UserAddr userAddr);
}
