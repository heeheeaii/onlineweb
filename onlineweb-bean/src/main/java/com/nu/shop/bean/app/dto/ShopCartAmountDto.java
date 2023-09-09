

package com.nu.shop.bean.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author laoma
 */
@Data
@Schema(description = "购物车合计")
public class ShopCartAmountDto {

    @Schema(description = "总额" )
    private Double totalMoney;

    @Schema(description = "总计" )
    private Double finalMoney;

    @Schema(description = "减额" )
    private Double subtractMoney;

    @Schema(description = "商品数量" )
    private Integer count;
}
