package com.Evil.gmall.pms.service.impl;

import com.Evil.gmall.pms.entity.Product;
import com.Evil.gmall.pms.mapper.ProductMapper;
import com.Evil.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Evil
 * @since 2020-04-04
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
