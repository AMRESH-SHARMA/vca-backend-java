package com.vca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vca.entity.Model;

public interface ModelRepository extends JpaRepository<Model, Long> {

	@Query(value = "SELECT m.mod_name FROM models m WHERE m.seg_id = :segId AND m.mfg_id = :mfgId", nativeQuery = true)
	List<?> findModelBySeg_IdAndMfg_Id(@Param("segId") Long segId,
			@Param("mfgId") Long mfgId);
}
