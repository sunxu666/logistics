package com.ssm.dao;

import com.ssm.entity.DispatchBill;
import com.ssm.entity.DispatchBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DispatchBillMapper {
    long countByExample(DispatchBillExample example);

    int deleteByExample(DispatchBillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DispatchBill record);

    int insertSelective(DispatchBill record);

    List<DispatchBill> selectByExample(DispatchBillExample example);

    DispatchBill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DispatchBill record, @Param("example") DispatchBillExample example);

    int updateByExample(@Param("record") DispatchBill record, @Param("example") DispatchBillExample example);

    int updateByPrimaryKeySelective(DispatchBill record);

    int updateByPrimaryKey(DispatchBill record);
}