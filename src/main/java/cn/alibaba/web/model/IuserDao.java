package cn.alibaba.web.model;


import cn.alibaba.web.pojo.User;

import java.util.List;

public interface IuserDao {

    User queryById(int id);

    List<User> queryAll();

    void deleteById(int id);








}
