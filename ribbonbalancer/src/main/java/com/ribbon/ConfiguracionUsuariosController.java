package com.ribbon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kata16.microservice.pojo.Configuracion;
import com.kata16.microservice.pojo.FilterConfiguration;



@RestController
@RequestMapping("/ribboncfg")
public class ConfiguracionUsuariosController {

	@Autowired
	private IConfiguracionUsuarios iConfiguracionUsuarios; 
	
	
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Configuracion create(@RequestBody Configuracion configuracion)
	{
		//TODO ...
		return null;
	}
	
	@RequestMapping(value = "/deleteAll", method = RequestMethod.POST)
	public void deleteAll()
	{
		//TODO
	}
	
	@RequestMapping(value = "/deleteById", method = RequestMethod.POST)
	public void deleteById(@RequestParam(value = "id") String id)
	{
		
	}
	
	@RequestMapping(value = "/getById", method = RequestMethod.POST)
	public Configuracion getById(@RequestParam(value = "id") String id)
	{
		//TODO ...
		return null;
	}


	@RequestMapping(value = "/findAll", method = RequestMethod.POST)
	public List<Configuracion> getAllNotifications()
	{
		//TODO ...
		return null;
	}


	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Configuracion save(@RequestBody Configuracion configuracion)
	{
		//TODO ...
		return null;
	}
	
	
	@RequestMapping(value = "/findByReferenceUser", method = RequestMethod.POST)
	public Configuracion findByTypeReferenceUser(@RequestBody FilterConfiguration filtro)
	{
		//TODO ...
		return null;
	}
	
}
