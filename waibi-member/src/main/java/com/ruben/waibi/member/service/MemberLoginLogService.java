package com.ruben.waibi.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruben.common.utils.PageUtils;
import com.ruben.waibi.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录; InnoDB free: 8192 kB
 *
 * @author achao
 * @email achao1441470436@gmail.com
 * @date 2020-04-26 12:46:55
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

