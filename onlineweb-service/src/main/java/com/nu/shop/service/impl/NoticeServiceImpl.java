

package com.nu.shop.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nu.shop.bean.app.dto.NoticeDto;
import com.nu.shop.bean.model.Notice;
import com.nu.shop.dao.NoticeMapper;
import com.nu.shop.service.NoticeService;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 公告管理
 *
 * @author hzm
 * @date 2022-04-18 21:21:40
 */
@Service
@AllArgsConstructor
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements NoticeService {

    private NoticeMapper noticeMapper;

    @Override
    @Cacheable(cacheNames = "notices", key = "'notices'")
    public List<Notice> listNotice() {
        return noticeMapper.selectList(new LambdaQueryWrapper<Notice>()
                .eq(Notice::getStatus, 1)
                .eq(Notice::getIsTop, 1)
                .orderByDesc(Notice::getPublishTime));
    }

    @Override
    @CacheEvict(cacheNames = "notices", key = "'notices'")
    public void removeNoticeList() {
    }

    @Override
    public Page<NoticeDto> pageNotice(Page<NoticeDto> page) {
        return noticeMapper.pageNotice(page);
    }

    @Override
    @Cacheable(cacheNames = "notice", key = "#noticeId")
    public Notice getNoticeById(Long noticeId) {
        return noticeMapper.selectById(noticeId);
    }

    @Override
    @CacheEvict(cacheNames = "notice", key = "#noticeId")
    public void removeNoticeById(Long noticeId) {
    }


}
