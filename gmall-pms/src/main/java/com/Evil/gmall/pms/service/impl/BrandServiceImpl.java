package com.Evil.gmall.pms.service.impl;

import com.Evil.gmall.pms.entity.Brand;
import com.Evil.gmall.pms.mapper.BrandMapper;
import com.Evil.gmall.pms.service.BrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author Evil
 * @since 2020-04-04
 */
@com.alibaba.dubbo.config.annotation.Service
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
