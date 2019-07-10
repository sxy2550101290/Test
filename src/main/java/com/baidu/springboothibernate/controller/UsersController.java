package com.baidu.springboothibernate.controller;

import com.baidu.springboothibernate.domin.Users;
import com.baidu.springboothibernate.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;
    @RequestMapping("/find")
    public Users findone(Integer id){
        return usersService.findById(id);
    }
    @RequestMapping("/all")
    public List<Users> findAll(){
        return usersService.findAll();
    }
    @RequestMapping("/save")
    public String save(Users users){
        Users save = this.usersService.save(users);
        if(save!=null){
            return "成功";
        }else{
            return "失败";
        }
    }
    @RequestMapping("/delete")
    public String delete(Integer id){
        Users user = usersService.findById(id);
        this.usersService.delete(user);
        return "成功";
    }
    @RequestMapping("/sort")
    public List<Users> sort(){
        return this.usersService.findAllSolrDesc();
    }
    @RequestMapping("/page")
    public List<Users> page(){
        return this.usersService.fingpageable();
    }

}
