package com.springcloud.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcloud.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
