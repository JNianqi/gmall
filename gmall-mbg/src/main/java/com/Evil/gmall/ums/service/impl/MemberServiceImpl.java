package com.Evil.gmall.ums.service.impl;

import com.Evil.gmall.ums.entity.Member;
import com.Evil.gmall.ums.mapper.MemberMapper;
import com.Evil.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Evil
 * @since 2020-04-04
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
