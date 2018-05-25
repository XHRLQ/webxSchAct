package com.luoqing.learning.app1.module.screen;

import com.alibaba.citrus.turbine.Context;
import com.luoqing.learning.app1.model.Catgory;
import com.luoqing.learning.app1.model.Client;
import com.luoqing.learning.app1.resource.CatgoryMapper;
import com.luoqing.learning.app1.resource.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class Manager {
    @Autowired
    HttpServletRequest request;
    @Autowired
    HttpServletResponse response;
    @Autowired
    ClientMapper clientMapper;
    @Autowired
    CatgoryMapper catgoryMapper;

    /**
     * 获取manageUsers页面需要的信息
     * @param context
     */
    public void manageUser(Context context){
            List<Client> clients=clientMapper.selectClients();
            context.put("clients",clients);
    }

    /**
     * 获取manageUsers页面需要的信息
     * @param context
     */
    public void manageCatgory(Context context){
        List<Catgory> catgories=catgoryMapper.selectCatgories();
        context.put("catgories",catgories);
    }

    /**
     * 获取modifyUser页面需要用到的信息
     * @param context
     */
    public void modifyUser(Context context){
        long id=Long.parseLong(request.getParameter("id"));
        Client client=clientMapper.selectClientById(id);
        context.put("client",client);
    }
}
