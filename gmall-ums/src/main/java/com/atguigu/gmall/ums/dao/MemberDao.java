package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangbiao
 * @email 3348821303@qq.com
 * @date 2019-10-29 01:50:00
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
