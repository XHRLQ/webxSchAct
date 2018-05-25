package com.luoqing.learning.app1.resource;

import com.luoqing.learning.app1.model.Catgory;

import java.util.List;

public interface CatgoryMapper {

    public int insertCatgory(Catgory catgory);

    public int deleteCatgory(Catgory catgory);

    public Catgory selectCatgoryById(long id);

    public List<Catgory> selectCatgories();
}
