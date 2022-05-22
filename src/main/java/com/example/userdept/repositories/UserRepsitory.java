package com.example.userdept.repositories;

import com.example.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepsitory extends JpaRepository<User, Long>{
    
}
