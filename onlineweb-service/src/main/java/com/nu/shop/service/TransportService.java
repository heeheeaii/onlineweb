

package com.nu.shop.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.nu.shop.bean.model.Transport;

/**
 *
 * @author hee on 2022/11/16.
 */
public interface TransportService extends IService<Transport> {
	/**
	 * 插入运费模板和运费项
	 * @param transport
	 */
	void insertTransportAndTransfee(Transport transport);

	/**
	 * 根据运费模板和运费项
	 * @param transport
	 */
	void updateTransportAndTransfee(Transport transport);

	/**
	 * 根据id列表删除运费模板和运费项
	 * @param ids
	 */
	void deleteTransportAndTransfeeAndTranscity(Long[] ids);

	/**
	 * 根据模板id获取运费模板和运费项
	 * @param transportId
	 * @return
	 */
	Transport getTransportAndAllItems(Long transportId);

	/**
	 * 删除缓存
	 * @param transportId
	 */
	void removeTransportAndAllItemsCache(Long transportId);

}