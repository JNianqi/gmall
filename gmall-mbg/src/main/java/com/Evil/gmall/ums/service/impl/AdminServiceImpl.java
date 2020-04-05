package com.Evil.gmall.ums.service.impl;

import com.Evil.gmall.ums.entity.Admin;
import com.Evil.gmall.ums.mapper.AdminMapper;
import com.Evil.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Evil
 * @since 2020-04-04
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
