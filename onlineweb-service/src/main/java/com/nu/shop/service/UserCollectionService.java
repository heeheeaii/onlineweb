

package com.nu.shop.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nu.shop.bean.app.dto.UserCollectionDto;
import com.nu.shop.bean.model.UserCollection;

/**
 * 用户收藏表
 *
 * @author xwc
 * @date 2022-04-19 16:57:20
 */
public interface UserCollectionService extends IService<UserCollection> {
    /**
     * 分页获取用户收藏
     * @param page
     * @param userId
     * @return
     */
    IPage<UserCollectionDto> getUserCollectionDtoPageByUserId(Page page, String userId);
}
