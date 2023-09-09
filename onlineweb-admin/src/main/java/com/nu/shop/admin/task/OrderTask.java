

package com.nu.shop.admin.task;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DateUtil;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.nu.shop.bean.enums.OrderStatus;
import com.nu.shop.bean.model.Order;
import com.nu.shop.bean.model.OrderItem;
import com.nu.shop.service.OrderService;
import com.nu.shop.service.ProductService;
import com.nu.shop.service.SkuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;


/**
 * 
 * 定时任务的配置，请查看xxl-job的java配置文件。
 * @see com.nu.shop.admin.config.XxlJobConfig
 */
@Component("orderTask")
public class OrderTask {


    private static final Logger logger = LoggerFactory.getLogger(OrderTask.class);

    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;
    @Autowired
    private SkuService skuService;

    @XxlJob("cancelOrder")
    public void cancelOrder(){
        Date now = new Date();
        logger.info("取消超时未支付订单。。。");
        // 获取30分钟之前未支付的订单
        List<Order> orders = orderService.listOrderAndOrderItems(OrderStatus.UNPAY.value(),DateUtil.offsetMinute(now, -30));
        if (CollectionUtil.isEmpty(orders)) {
            return;
        }
        orderService.cancelOrders(orders);
        for (Order order : orders) {
            List<OrderItem> orderItems = order.getOrderItems();
            for (OrderItem orderItem : orderItems) {
                productService.removeProductCacheByProdId(orderItem.getProdId());
                skuService.removeSkuCacheBySkuId(orderItem.getSkuId(),orderItem.getProdId());
            }
        }
    }

    /**
     * 确认收货
     */
    @XxlJob("confirmOrder")
    public void confirmOrder(){
        Date now = new Date();
        logger.info("系统自动确认收货订单。。。");
        // 获取15天之前未支付的订单
        List<Order> orders = orderService.listOrderAndOrderItems(OrderStatus.CONSIGNMENT.value(),DateUtil.offsetDay(now, -15));
        if (CollectionUtil.isEmpty(orders)) {
            return;
        }
        orderService.confirmOrder(orders);
        for (Order order : orders) {
            List<OrderItem> orderItems = order.getOrderItems();
            for (OrderItem orderItem : orderItems) {
                productService.removeProductCacheByProdId(orderItem.getProdId());
                skuService.removeSkuCacheBySkuId(orderItem.getSkuId(),orderItem.getProdId());
            }
        }
    }

}
