package com.vca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vca.entity.Component;

public interface ComponentRepository extends JpaRepository<Component, Long> {

}
