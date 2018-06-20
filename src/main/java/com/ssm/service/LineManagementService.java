package com.ssm.service;

import com.ssm.entity.LineManagement;

import java.util.List;

/**
 * 线路管理
 * @author
 */
public interface LineManagementService {

    void saveLineManagement(LineManagement lineManagement);

    List<LineManagement> getAll();

    void deleteEl(Integer id);
}
