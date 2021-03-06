package com.Evil.gmall.oms.service.impl;

import com.Evil.gmall.oms.entity.OrderItem;
import com.Evil.gmall.oms.mapper.OrderItemMapper;
import com.Evil.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author Evil
 * @since 2020-04-04
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
