package com.tgsouza.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tgsouza.coursespring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
