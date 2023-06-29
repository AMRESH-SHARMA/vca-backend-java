package com.vca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vca.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query(value = "SELECT p.name FROM products p WHERE p.category_id = :categoryId AND p.subcategory_id = :subcategoryId", nativeQuery = true)
	List<?> findByCategory_IdAndSubcategory_Id(@Param("categoryId") Long categoryId,
			@Param("subcategoryId") Long subcategoryId);
}
