package com.Evil.gmall.pms.service.impl;

import com.Evil.gmall.pms.entity.ProductFullReduction;
import com.Evil.gmall.pms.mapper.ProductFullReductionMapper;
import com.Evil.gmall.pms.service.ProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author Evil
 * @since 2020-04-04
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}
