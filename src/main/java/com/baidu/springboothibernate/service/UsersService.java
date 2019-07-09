package com.baidu.springboothibernate.service;


import com.baidu.springboothibernate.domin.Users;
import com.baidu.springboothibernate.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService{
    @Autowired
    private UsersRepository usersRepository;

    public Users findById(Integer id){
        return usersRepository.getOne(id);
    }

    public List<Users> findAll(){
       return this.usersRepository.findAll();
    }

    public Users save(Users users){
        return this.usersRepository.save(users);
    }

    public void delete(Users users){
       this.usersRepository.delete(users);
    }

    public List<Users> findAllSolrDesc(){
        Sort sort=new Sort(Sort.Direction.DESC,"id");
        return this.usersRepository.findAll(sort);
    }

}
