package com.vca.services;

import java.util.List;

import com.vca.dto.AlternateComponentDTO;
import com.vca.entity.AlternateComponent;
import com.vca.entity.Component;
import com.vca.entity.Vehicle;

public interface AlternateComponentService {

	List<AlternateComponent> getAllComponents();

	//List<AlternateComponent> getComponent(int id);

	void deleteComponent(int id);

	void updateComponent(int id, AlternateComponent altcomp);

	void addComponent(AlternateComponent altcomps);
	
	public List<Component> findByModelIdAndCompId(int id1, int id2);
	//public List<Object> getStdComponents(int mod_id);
	//public List<AlternateComponent> findByModelIdAndCompId(int id1, int id2);

}
