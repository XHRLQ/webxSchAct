package com.luoqing.learning.app1.module.action;

import com.alibaba.citrus.service.template.TemplateContext;
import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;
import com.luoqing.learning.app1.model.Client;
import com.luoqing.learning.app1.resource.ClientMapper;
import com.luoqing.learning.app1.resource.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

public class ManageUserAction {
    @Autowired
    HttpServletRequest request;
    @Autowired
    HttpServletResponse response;
    @Autowired
    ManagerMapper managerMapper;
    @Autowired
    ClientMapper clientMapper;

    /**
     * 添加客户
     * @param client
     * @param nav
     */
    public void addUser(@FormGroup("add")Client client, Navigator nav){
        clientMapper.insertClient(client);
        nav.redirectTo("@app1Link").withTarget("manager/hint").withParameter("operation","添加");
    }

    /**
     * 删除用户
     * @param nav
     */
    public void deleteUser(Navigator nav){
        long id=Long.parseLong(request.getParameter("id"));
        Client client=clientMapper.selectClientById(id);
        clientMapper.deleteClient(client);
        nav.redirectTo("@app1Link").withTarget("manage/hint").withParameter("operation","删除");
    }

    /**
     * 处理modifyUser页面的修改客户信息请求
     * @param client
     * @param nav
     */
    public void modifyUser(@FormGroup("add")Client client,Navigator nav){
        clientMapper.updateClient(client);
        nav.redirectTo("@app1Link").withTarget("manager/hint").withParameter("operation","修改");
    }

}
