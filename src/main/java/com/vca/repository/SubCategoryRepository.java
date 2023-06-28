package com.vca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vca.entity.SubCategory;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {

	List<SubCategory> findByCategoryId(Long postId);

}
