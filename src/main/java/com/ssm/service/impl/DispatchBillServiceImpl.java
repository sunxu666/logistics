package com.ssm.service.impl;

import com.ssm.dao.DispatchBillMapper;
import com.ssm.entity.DispatchBill;
import com.ssm.service.DispatchBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DispatchBillServiceImpl implements DispatchBillService {
    @Autowired
    private DispatchBillMapper dispatchBillMapper;

    @Override
    public int saveTicketNo(DispatchBill dispatchBill) {
       int result = dispatchBillMapper.insertSelective(dispatchBill);
        return result;
    }
}
