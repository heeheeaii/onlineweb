

package com.nu.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hee
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ShopCartItemDto extends ProductItemDto implements Serializable {
    private static final long serialVersionUID = -8284981156242930909L;

    @Schema(description = "购物车ID" , required = true)
    private Long basketId;

    @Schema(description = "店铺ID" , required = true)
    private Long shopId;

    @Schema(description = "规格名称" , required = true)
    private String skuName;

    @Schema(description = "店铺名称" , required = true)
    private String shopName;

    @Schema(description = "商品原价" , required = true)
    private Double oriPrice;

    @Schema(description = "推广员使用的推销卡号" )
    private String distributionCardNo;

    @Schema(description = "加入购物车的时间" )
    private Date basketDate;
}
