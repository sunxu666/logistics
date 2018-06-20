package com.ssm.controller;

import com.ssm.entity.DispatchBill;
import com.ssm.service.DispatchBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

import javax.validation.Valid;

/**
 * 开票系统控制台
 *
 * @author
 */
@Controller
public class OpenTicketController {
    @Autowired
    private DispatchBillService dispatchBillService;

    /**
     * 票单复核
     */
    @RequestMapping(value = "/saveTicketNo1")
    public String saveTicketNo( DispatchBill dispatchBill) {

        int result = dispatchBillService.saveTicketNo(dispatchBill);
        //成功跳到电脑开票，失败还在发票复核页面
        if(result>0){
            return "redirect:/电脑开票";
        }
        return "redirect:/openTicket";
    }
}
