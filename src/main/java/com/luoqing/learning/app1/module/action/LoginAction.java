package com.luoqing.learning.app1.module.action;

import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;
import com.luoqing.learning.app1.model.Manager;
import com.luoqing.learning.app1.resource.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public class LoginAction {
    @Autowired
    ManagerMapper managerMapper;
    public void doLogin(@FormGroup("login")Manager manager, Navigator nav, HttpSession session){
        Manager existedManager=managerMapper.selectManager(manager.getName(),manager.getPswd());
        if(existedManager!=null){
            session.setAttribute("manager",existedManager);
            nav.redirectTo("app1Link").withTarget("manager/home");
        }
    }
}
