

package com.nu.shop.bean.event;

import com.nu.shop.bean.app.dto.ShopCartOrderMergerDto;
import com.nu.shop.bean.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 提交订单时的事件
 * @author hee
 */
@Data
@AllArgsConstructor
public class SubmitOrderEvent {
    /**
     * 完整的订单信息
     */
    private final ShopCartOrderMergerDto mergerOrder;

    private List<Order> orders;

}
