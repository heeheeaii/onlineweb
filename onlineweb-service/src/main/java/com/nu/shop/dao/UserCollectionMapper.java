

package com.nu.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nu.shop.bean.app.dto.UserCollectionDto;
import com.nu.shop.bean.model.UserCollection;

/**
 * 用户收藏表
 *
 * @author xwc
 * @date 2022-04-19 16:57:20
 */
public interface UserCollectionMapper extends BaseMapper<UserCollection> {
   /**
    * 分页获取用户收藏
    * @param page
    * @param userId
    * @return
    */
   IPage<UserCollectionDto> getUserCollectionDtoPageByUserId(Page page, String userId);

}
