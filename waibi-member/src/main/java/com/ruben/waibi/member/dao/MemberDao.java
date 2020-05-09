package com.ruben.waibi.member.dao;

import com.ruben.waibi.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员; InnoDB free: 8192 kB
 * 
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 12:46:55
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
