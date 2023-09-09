

package com.nu.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nu.shop.bean.dto.HotSearchDto;
import com.nu.shop.bean.model.HotSearch;

import java.util.List;

/**
 * @author laoma
 */
public interface HotSearchMapper extends BaseMapper<HotSearch> {
    /**
     * 根据店铺id获取热搜列表
     * @param shopId
     * @return
     */
    List<HotSearchDto> getHotSearchDtoByShopId(Long shopId);
}
