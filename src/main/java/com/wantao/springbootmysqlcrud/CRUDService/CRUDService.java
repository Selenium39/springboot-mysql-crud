package com.wantao.springbootmysqlcrud.CRUDService;

import com.wantao.springbootmysqlcrud.bean.User;
import com.wantao.springbootmysqlcrud.dao.CRUDDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CRUDService implements CRUDDao {
    @Autowired
    private CRUDDao crudDao;
    @Override
    public List getAllUser() {
        return crudDao.getAllUser();
    }

    @Override
    public User getUserById(Integer id) {
        return crudDao.getUserById(id);
    }

    @Override
    public int addUser(User user) {
        return crudDao.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return crudDao.updateUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return crudDao.deleteUser(id);
    }
}
