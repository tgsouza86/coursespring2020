package com.tgsouza.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tgsouza.coursespring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
