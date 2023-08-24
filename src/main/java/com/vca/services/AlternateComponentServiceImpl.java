package com.vca.services;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vca.entity.AlternateComponent;
import com.vca.entity.Component;
import com.vca.repositories.AlternateComponentRepository;


@Service
public class AlternateComponentServiceImpl implements AlternateComponentService {
	
	@Autowired
	AlternateComponentRepository repository;

	
//	public List<Object> getStdComponents(int mod_id) {
//		return repository.getStdComp(mod_id);
//	}
	
	@Override
	public List<AlternateComponent> getAllComponents() {
		return repository.findAll();
	}
//
//	@Override
//	public List<AlternateComponent> getComponent(int id) {
//		return repository.findByModelId(id);
//	}

	@Override
	public void deleteComponent(int id) {
		repository.deleteById(id);
	}

	@Override
	public void updateComponent(int id, AlternateComponent altcomp) {
	}

	@Override
	public void addComponent(AlternateComponent altcomps) {
		repository.save(altcomps);
	}
	
//	public List<AlternateComponent> findByModelIdAndCompId(int id1, int id2) {
//		return repository.findByModelIdAndCompId(id1, id2);
//	}

	public List<Component> findByModelIdAndCompId(int id1, int id2) {
		List<AlternateComponent> list = repository.findByModelIdAndCompId(id1, id2);
		List<Component> complist = new ArrayList<Component>();
		Iterator<AlternateComponent> itr = list.listIterator();
		
		while(itr.hasNext()) {
			complist.add(itr.next().getAltCompId());
		}
		return complist;
		//System.out.println(complist);
		
		//return repository.findByModelIdAndCompId(id1, id2);
	}
}
