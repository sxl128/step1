package cn.alibaba.web.service;

import cn.alibaba.web.model.IuserDao;
import cn.alibaba.web.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IuserDao iuserDao;

  public User queryById(int id){

        return  iuserDao.queryById(id);

    }

    public void deleteById(int id){

         iuserDao.deleteById(id);

    }


}
