package com.Evil.gmall.pms.service.impl;

import com.Evil.gmall.pms.entity.Comment;
import com.Evil.gmall.pms.mapper.CommentMapper;
import com.Evil.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Evil
 * @since 2020-04-04
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
