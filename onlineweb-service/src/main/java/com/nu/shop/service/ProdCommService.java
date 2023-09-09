

package com.nu.shop.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nu.shop.bean.app.dto.ProdCommDataDto;
import com.nu.shop.bean.app.dto.ProdCommDto;
import com.nu.shop.bean.model.ProdComm;


/**
 * 商品评论
 *
 * @author xwc
 * @date 2022-04-19 10:43:57
 */
public interface ProdCommService extends IService<ProdComm> {
    /**
     * 根据商品id获取商品评论信息
     * @param prodId
     * @return
     */
    ProdCommDataDto getProdCommDataByProdId(Long prodId);

    /**
     * 根据用户id分页获取商品评论
     * @param page
     * @param userId
     * @return
     */
    IPage<ProdCommDto> getProdCommDtoPageByUserId(Page page,String userId);

    /**
     * 根据商品id和评价等级获取商品评价
     * @param page
     * @param prodId
     * @param evaluate
     * @return
     */
    IPage<ProdCommDto> getProdCommDtoPageByProdId(Page page, Long prodId, Integer evaluate);

    /**
     * 根据参数分页获取商品评价
     * @param page
     * @param prodComm
     * @return
     */
    IPage<ProdComm> getProdCommPage(Page page,ProdComm prodComm);

}
