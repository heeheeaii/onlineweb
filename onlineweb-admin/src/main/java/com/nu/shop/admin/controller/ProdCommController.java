

package com.nu.shop.admin.controller;

import com.nu.shop.bean.model.ProdComm;
import com.nu.shop.common.annotation.SysLog;
import com.nu.shop.service.ProdCommService;
import lombok.AllArgsConstructor;

import jakarta.validation.Valid;

import com.nu.shop.common.response.ServerResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.nu.shop.common.util.PageParam;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.Date;

/**
 * 商品评论
 *
 * @author xwc
 * @date 2022-04-19 10:43:57
 */
@RestController
@AllArgsConstructor
@RequestMapping("/prod/prodComm" )
public class ProdCommController {

    private final ProdCommService prodCommService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param prodComm 商品评论
     * @return 分页数据
     */
    @GetMapping("/page" )
    @PreAuthorize("@pms.hasPermission('prod:prodComm:page')" )
    public ServerResponseEntity<IPage<ProdComm>> getProdCommPage(PageParam page, ProdComm prodComm) {
        return ServerResponseEntity.success(prodCommService.getProdCommPage(page,prodComm));
    }


    /**
     * 通过id查询商品评论
     * @param prodCommId id
     * @return 单个数据
     */
    @GetMapping("/info/{prodCommId}" )
    @PreAuthorize("@pms.hasPermission('prod:prodComm:info')" )
    public ServerResponseEntity<ProdComm> getById(@PathVariable("prodCommId" ) Long prodCommId) {
        return ServerResponseEntity.success(prodCommService.getById(prodCommId));
    }

    /**
     * 新增商品评论
     * @param prodComm 商品评论
     * @return 是否新增成功
     */
    @SysLog("新增商品评论" )
    @PostMapping
    @PreAuthorize("@pms.hasPermission('prod:prodComm:save')" )
    public ServerResponseEntity<Boolean> save(@RequestBody @Valid ProdComm prodComm) {
        return ServerResponseEntity.success(prodCommService.save(prodComm));
    }

    /**
     * 修改商品评论
     * @param prodComm 商品评论
     * @return 是否修改成功
     */
    @SysLog("修改商品评论" )
    @PutMapping
    @PreAuthorize("@pms.hasPermission('prod:prodComm:update')" )
    public ServerResponseEntity<Boolean> updateById(@RequestBody @Valid ProdComm prodComm) {
        prodComm.setReplyTime(new Date());
        return ServerResponseEntity.success(prodCommService.updateById(prodComm));
    }

    /**
     * 通过id删除商品评论
     * @param prodCommId id
     * @return 是否删除成功
     */
    @SysLog("删除商品评论" )
    @DeleteMapping("/{prodCommId}" )
    @PreAuthorize("@pms.hasPermission('prod:prodComm:delete')" )
    public ServerResponseEntity<Boolean> removeById(@PathVariable Long prodCommId) {
        return ServerResponseEntity.success(prodCommService.removeById(prodCommId));
    }

}
