/**
 * Cash-Register
 * Copyright (c) 1995-2018 All Rights Reserved.
 */
package cn.cash.register.controller.frontstage;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cash.register.common.request.MemberRechargeRequest;
import cn.cash.register.service.MemberRechargeService;
import cn.cash.register.util.ResultSet;

/**
 * 前台收银会员充值Controller
 * @author HuHui
 * @version $Id: MemberRechargeController.java, v 0.1 2018年5月10日 下午7:18:20 HuHui Exp $
 */
@Controller
@RequestMapping(value = "/cashier/memberRecharge")
public class MemberRechargeController {

    @Resource
    private MemberRechargeService memberRechargeService;

    /**
     * 会员余额充值
     */
    @ResponseBody
    @PostMapping(value = "/recharge")
    public ResultSet recharge(MemberRechargeRequest request) {
        boolean ret = memberRechargeService.recharge(request);
        return ResultSet.success().put("ret", ret);
    }

}
