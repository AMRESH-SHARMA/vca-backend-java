package com.vca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vca.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
