package com.wantao.springbootmysqlcrud.controller;

import com.wantao.springbootmysqlcrud.CRUDService.CRUDService;
import com.wantao.springbootmysqlcrud.bean.User;
import com.wantao.springbootmysqlcrud.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CRUDController {
    @Autowired
    private CRUDService crudService;

    /**
     * 查询一个用户
     * @param id
     * @return
     */
    @GetMapping("/getUserById/{id}")
    public Result getUserById(@PathVariable("id")Integer id){
        User user=crudService.getUserById(id);
        return Result.success().add("user",user);
    }

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/getAllUser")
    public Result getAllUser(){
        List<User> users=crudService.getAllUser();
        return Result.success().add("user",users);
    }

    @GetMapping("/addUser")
    public Result addUser(){
        User user=new User();
        user.setId(2);
        user.setUsername("selenium1");
        user.setPassword("123");
        crudService.addUser(user);
        return Result.success();
    }

    @GetMapping("/updateUser")
    public Result updateUser(){
        User user=new User();
        user.setId(1);
        user.setUsername("seleniumupdate");
        user.setPassword("123");
        crudService.updateUser(user);
        return Result.success();
    }

    @GetMapping("/deleteUser/{id}")
    public Result deleteUser(@PathVariable("id") Integer id){
        crudService.deleteUser(id);
        return Result.success();
    }



}
