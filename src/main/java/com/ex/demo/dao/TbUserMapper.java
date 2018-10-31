package com.ex.demo.dao;

import com.ex.demo.model.TbUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbUserMapper extends tk.mybatis.mapper.common.Mapper<TbUser> {
}