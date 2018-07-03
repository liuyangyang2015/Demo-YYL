package com.bigroad.springbootdemo.dao;

import com.bigroad.springbootdemo.domain.ChangeApplication;
import com.bigroad.springbootdemo.domain.ChangeApplicationExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ChangeApplicationMapper {
    int countByExample(ChangeApplicationExample example);

    int deleteByExample(ChangeApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChangeApplication record);

    int insertSelective(ChangeApplication record);

    List<ChangeApplication> selectByExample(ChangeApplicationExample example);

    ChangeApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChangeApplication record, @Param("example") ChangeApplicationExample example);

    int updateByExample(@Param("record") ChangeApplication record, @Param("example") ChangeApplicationExample example);

    int updateByPrimaryKeySelective(ChangeApplication record);

    int updateByPrimaryKey(ChangeApplication record);
}