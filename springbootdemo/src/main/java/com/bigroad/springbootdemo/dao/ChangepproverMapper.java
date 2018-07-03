package com.bigroad.springbootdemo.dao;

import com.bigroad.springbootdemo.domain.Changepprover;
import com.bigroad.springbootdemo.domain.ChangepproverExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChangepproverMapper {
    int countByExample(ChangepproverExample example);

    int deleteByExample(ChangepproverExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Changepprover record);

    int insertSelective(Changepprover record);

    List<Changepprover> selectByExample(ChangepproverExample example);

    Changepprover selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Changepprover record, @Param("example") ChangepproverExample example);

    int updateByExample(@Param("record") Changepprover record, @Param("example") ChangepproverExample example);

    int updateByPrimaryKeySelective(Changepprover record);

    int updateByPrimaryKey(Changepprover record);
}