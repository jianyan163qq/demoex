package com.ex.demo.dao;

import com.ex.demo.model.TbClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbClassMapper extends tk.mybatis.mapper.common.Mapper<TbClass> {
    int deleteByPrimaryKey(Long id);

    int insert(TbClass record);

    TbClass selectByPrimaryKey(Long id);

    List<TbClass> selectAll();

    int updateByPrimaryKey(TbClass record);
}