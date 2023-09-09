

package com.nu.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nu.shop.bean.dto.HotSearchDto;
import com.nu.shop.bean.model.HotSearch;

import java.util.List;

/**
 *
 * @author hee on 2022/03/27.
 */
public interface HotSearchService extends IService<HotSearch> {

    /**
     * 根据店铺id获取热搜列表
     * @param shopId
     * @return
     */
    List<HotSearchDto> getHotSearchDtoByShopId(Long shopId);

    /**
     * 根据店铺id删除热搜缓存
     * @param shopId
     */
    void removeHotSearchDtoCacheByShopId(Long shopId);
}
