package com.luoqing.learning.app1.resource;

import com.luoqing.learning.app1.model.Manager;

public interface ManagerMapper {
    public Manager selectManager(String name, String pswd);
}
