package com.example.pp_3_1_1.dao;


import com.example.pp_3_1_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoru extends JpaRepository<User, Long> {
}

