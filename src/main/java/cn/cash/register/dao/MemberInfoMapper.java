package cn.cash.register.dao;

import java.util.List;

import cn.cash.register.common.request.MemberInfoQueryRequest;
import cn.cash.register.dao.domain.MemberInfo;

public interface MemberInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberInfo record);

    Long insertSelective(MemberInfo record);

    MemberInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberInfo record);

    int updateByPrimaryKey(MemberInfo record);

    List<MemberInfo> list(MemberInfoQueryRequest request);
}