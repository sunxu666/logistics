package com.ssm.service.impl;

import com.ssm.dao.LineManagementMapper;
import com.ssm.entity.LineManagement;
import com.ssm.service.LineManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineManagementServiceImpl implements LineManagementService {
    @Autowired
    private LineManagementMapper lineManagementMapper;

    /**
     * 保存线路管理对象
     * @param lineManagement
     * @return
     */
    @Override
    public void saveLineManagement(LineManagement lineManagement) {
        lineManagementMapper.insertSelective(lineManagement);

    }

    @Override
    public List<LineManagement> getAll() {
        return lineManagementMapper.selectByExample(null);
    }

    @Override
    public void deleteEl(Integer id) {
        lineManagementMapper.deleteByPrimaryKey(id);
    }


}
