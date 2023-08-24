package com.vca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vca.entity.Model;
import com.vca.repositories.ModelRepository;

@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    ModelRepository modelRepository;

    @Override
    public Page<Model> getAllModelsByManuIdAndSegId(int manuId, int segId, Pageable pageable) {
        return modelRepository.findByManufacturerIdAndSegmentId(manuId, segId, pageable);
    }
    
    @Override
    public Page<Model> getAllModels(Pageable pageable) {
        return modelRepository.findAllByOrderByCreatedAtDesc(pageable);
    }

	@Override
	public List<Model> getModelsBySegId(int segId) {

//		List<Model> model = modelRepository.findBySegmentId(segId); 
//		System.out.println(model.get(0));
//		return model;
		return modelRepository.findBySegmentId(segId);
	}
    
}
