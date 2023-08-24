package com.vca.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.vca.entity.Model;

public interface ModelService {
	Page<Model> getAllModelsByManuIdAndSegId(int manuId, int segId, Pageable pageable);

	Page<Model> getAllModels(Pageable pageable);

	List<Model> getModelsBySegId(int segId);
	
}
