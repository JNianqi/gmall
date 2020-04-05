package com.Evil.gmall.oms.service.impl;

import com.Evil.gmall.oms.entity.CartItem;
import com.Evil.gmall.oms.mapper.CartItemMapper;
import com.Evil.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author Evil
 * @since 2020-04-04
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
