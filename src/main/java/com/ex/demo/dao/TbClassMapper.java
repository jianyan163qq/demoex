package com.ex.demo.dao;

import com.ex.demo.model.TbClass;
import java.util.List;

public interface TbClassMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbClass record);

    TbClass selectByPrimaryKey(Long id);

    List<TbClass> selectAll();

    int updateByPrimaryKey(TbClass record);
}