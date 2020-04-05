package com.Evil.gmall.oms.service.impl;

import com.Evil.gmall.oms.entity.Order;
import com.Evil.gmall.oms.mapper.OrderMapper;
import com.Evil.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Evil
 * @since 2020-04-04
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
