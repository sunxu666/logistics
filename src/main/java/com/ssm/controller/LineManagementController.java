package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.entity.LineManagement;
import com.ssm.service.LineManagementService;
import com.ssm.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LineManagementController {
    @Autowired
    private LineManagementService lineManagementService;
    @RequestMapping(value = "/lineManagement")
    public String getEmps(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        //这不是一个分页查询
        //引入PageHelper分页插件,在查询之前只需要调用，传入页码,以及每页的大小
        PageHelper.startPage(pn,5);
        //startPage后面紧跟的查询就是分页查询
        List<LineManagement> emps = lineManagementService.getAll();
        //使用pageInfo包装查询后的结果,只需将pageInfo交给页面就行了
        //封装了详细的分页信息，包括我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(emps,5);
        model.addAttribute("pageInfo",page);
        return "lineManagement";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/lm/{id}",method = RequestMethod.DELETE)
    public Msg deleteEmpById(@PathVariable("id")Integer id){
        lineManagementService.deleteEl(id);
        return Msg.success();
    }
}
