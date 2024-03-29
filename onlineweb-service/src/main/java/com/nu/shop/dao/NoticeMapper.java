

package com.nu.shop.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nu.shop.bean.app.dto.NoticeDto;
import com.nu.shop.bean.model.Notice;

/**
 * 公告管理
 *
 * @author hzm
 * @date 2022-04-18 21:21:40
 */
public interface NoticeMapper extends BaseMapper<Notice> {

    /**
     * 分页获取公布的公告
     * @param page
     * @return
     */
    Page<NoticeDto> pageNotice(Page<NoticeDto> page);
}
