

package com.nu.shop.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.nu.shop.bean.model.ProdTagReference;

import java.util.List;

/**
 * 分组标签引用
 *
 * @author hzm
 * @date 2022-04-18 16:28:01
 */
public interface ProdTagReferenceService extends IService<ProdTagReference> {
    /**
     * 根据id获取标签id列表
     * @param prodId
     * @return
     */
    List<Long> listTagIdByProdId(Long prodId);
}
