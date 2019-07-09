package com.baidu.springboothibernate.repository;

import com.baidu.springboothibernate.domin.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {
}
