package com.vca.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vca.dto.AlternateComponentDTO;
import com.vca.entity.AlternateComponent;
import com.vca.entity.Component;
import com.vca.entity.Vehicle;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface AlternateComponentRepository extends JpaRepository<AlternateComponent, Integer>
{
//	@Query(value = "select * from vehicle where comp_type like 'S' and mod_id = 1021", nativeQuery = true)
//	public List<Object> getStdComp(@Param("mod_id") int mod_id);
//	
//	@Query(value = "select * from Vehicle where compType='S' and modelId = :mod_id")
//	public List<Object> getStdComp(@Param("mod_id") int mod_id);
//
	@Query(value = "SELECT * FROM AlternateComponent a WHERE a.mod_id = :id1 AND a.com_Id = :id2 and a.com_id!=a.alt_com_id", nativeQuery = true)
	List<AlternateComponent> findByModelIdAndCompId(@Param("id1") int id1, @Param("id2") int id2);

//	
	
//	@Query(value = "SELECT new com.vca.dto.AlternateComponentDTO (c.compId, c.compName) FROM AlternateComponent a join Component c on a.altCompId = c.compId WHERE a.modelId = :id1 AND a.com_Id = :id2 and a.compId!=a.altCompId")
//	List<AlternateComponentDTO> findByModelIdAndCompId(@Param("id1") int id1, @Param("id2") int id2);
//
	
//	@Query(value = "select new com.example.dtos.AlternateComponentDTO (c.sub_type,a.delta_price) from Component c join AlternateComponent a on c.compId = a.altCompId where model_id = :model_id")
//	public List<AlternateComponentDTO> getDefaultCompname(@Param("model_id") int model_id);
//	
//	@Query(value ="select distinct comp_name from vehicle_detail v join component c on v.comp_id = c.comp_id where is_configurable = 'y' and v.model_id = :model_id and v.comp_type = 's' ", nativeQuery = true)
//	List<String> getCompnameByStd(@Param("model_id") int model_id);
//	
//	@Query(value ="select distinct comp_name from vehicle_detail v join component c on v.comp_id = c.comp_id where is_configurable = 'y' and v.model_id = :model_id and v.comp_type = 'i' ", nativeQuery = true)
//	List<String> getCompnameByInt(@Param("model_id") int model_id);
//	
//	@Query(value ="select distinct comp_name from vehicle_detail v join component c on v.comp_id = c.comp_id where is_configurable = 'y' and v.model_id = :model_id and v.comp_type = 'e' ", nativeQuery = true)
//	List<String> getCompnameByExt(@Param("model_id") int model_id);
//	
//	
//	@Query(value = "select new com.example.dtos.SubCompPrice (c.sub_type,a.delta_price,a.alt_id) from Component c join Alternate_Component a on c.comp_id = a.alt_comp_id where model_id = :model_id and comp_name = :comp_name" )
//	public List<AlternateComponentDTO> getConfigurableConfig(@Param("model_id") int model_id , @Param("comp_name") String comp_name);
//	
}
