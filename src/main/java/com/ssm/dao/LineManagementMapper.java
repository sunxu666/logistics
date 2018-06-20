package com.ssm.dao;

import com.ssm.entity.LineManagement;
import com.ssm.entity.LineManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LineManagementMapper {
    long countByExample(LineManagementExample example);

    int deleteByExample(LineManagementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LineManagement record);

    int insertSelective(LineManagement record);

    List<LineManagement> selectByExample(LineManagementExample example);

    LineManagement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LineManagement record, @Param("example") LineManagementExample example);

    int updateByExample(@Param("record") LineManagement record, @Param("example") LineManagementExample example);

    int updateByPrimaryKeySelective(LineManagement record);

    int updateByPrimaryKey(LineManagement record);
}