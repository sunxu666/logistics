package com.ssm.service.impl;

import com.ssm.dao.LineManagementMapper;
import com.ssm.entity.LineManagement;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class LineManagementServiceImplTest {
    @Autowired
    private LineManagementMapper lineManagementMapper;
    /**
     * 这个在ApplicationContext中配置，可以批量生产
     */
    @Autowired
    SqlSession sqlSession;
    @Test
    public void saveLineManagement() {

        lineManagementMapper = sqlSession.getMapper(LineManagementMapper.class);
        for (int i = 0; i < 5 ; i++) {
            //产生的随机数：截取0-5
            //String uid = UUID.randomUUID().toString().substring(0,5)+i;
            lineManagementMapper.insertSelective(new LineManagement(null,"郑州","zz",null," 0371-8628715","0","0","0","0","0","0","0","0","0"));
        }
        System.out.println("测试完成！");
    }
}