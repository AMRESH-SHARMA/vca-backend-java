package com.vca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vca.dto.AlternateComponentDTO;
import com.vca.entity.AlternateComponent;
import com.vca.entity.Component;
import com.vca.entity.Vehicle;
import com.vca.services.AlternateComponentService;

@RestController
@CrossOrigin("*")
public class AlternateComponentController {

	@Autowired
	AlternateComponentService service;

//	@PostMapping(value ="api/alternate_components")
//	public void addAlternateComponent(@RequestBody AlternateComponent altcomps)
//	{
//		service.addComponent(altcomps);
//	}
//
	@GetMapping(value = "api/alternate_components")
	public List<AlternateComponent> showAlternateComponents()
	{
		return service.getAllComponents(); 
	}
	
	@GetMapping(value = "api/alternate_components/{modelId}/{compId}")
	public List<Component> showStdComponents(@PathVariable(value = "modelId") int mod_id, @PathVariable(value = "compId") int com_id)
	{
		return service.findByModelIdAndCompId(mod_id, com_id);
		//return service.findByModelIdAndCompId(mod_id, com_id); 
	}
	
	
//	
//	@GetMapping(value = "api/alternate_components/{id}")
//	public List<AlternateComponent> getAlternateComponent(@PathVariable int id)
//	{
//		return service.getComponent(id);
//	}
//	
//	@PutMapping(value = "api/alternate_components/{id}")
//	public void updateAlternateComponent(@PathVariable int id, @RequestBody AlternateComponent altcomp)
//	{
//		service.updateComponent(id, altcomp);
//	}
//
//	@DeleteMapping(value = "api/alternate_components/{id}")
//	public void removeAlternateComponent(@PathVariable int id)
//	{
//		service.deleteComponent(id);
//	}
	
}
