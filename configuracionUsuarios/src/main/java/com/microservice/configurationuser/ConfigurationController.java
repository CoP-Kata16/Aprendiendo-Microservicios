package com.microservice.configurationuser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.kata16.microservice.pojo.PojoUtil;
import com.kata16.microservice.pojo.Configuracion;
import com.kata16.microservice.pojo.FilterConfiguration;
import com.microservice.configurationuser.repository.ConfigurationRepository;

@RestController
@RequestMapping("/configuration")
public class ConfigurationController {

	@Autowired
	ConfigurationRepository configurationRepository;
	
	@RequestMapping("/create")
	public Configuracion create(@RequestBody Configuracion configuracion)
	{
		Configuracion cfg = this.findByReferenceUser(PojoUtil.createFilterConfiguration(configuracion));
		
		if (cfg == null) {
			return configurationRepository.insert(configuracion);
		} else {
			return cfg;
		}
	}
	
	@RequestMapping("/deleteAll")
	public void deleteAll()
	{
		configurationRepository.deleteAll();
	}
	
	@RequestMapping("/deleteById")
	public void deleteById(@RequestParam(value = "id") String id)
	{
		configurationRepository.delete(id);
	}
	
	@RequestMapping("/getById")
	public Configuracion getById(@RequestParam(value = "id") String id)
	{
		return configurationRepository.findOne(id);
	}


	@RequestMapping("/findAll")
	public List<Configuracion> getAllNotifications()
	{
		return configurationRepository.findAll();
	}


	@RequestMapping("/update")
	public Configuracion save(@RequestBody Configuracion configuracion)
	{
		Configuracion cfg = this.findByReferenceUser(PojoUtil.createFilterConfiguration(configuracion));
		
		if (cfg != null) {
			cfg.setActiva(configuracion.getActiva());
			return configurationRepository.save(cfg);
		} else {
			return configurationRepository.save(configuracion);
		}
	}

	@RequestMapping("/findByReferenceUser")
	public Configuracion findByReferenceUser(@RequestBody FilterConfiguration filtro) {
		try {
			return configurationRepository.findByReferenceUser(filtro.getTipoAlerta(), 
					filtro.getReference(), filtro.getUser());
		} catch (Exception e) {
			return new Configuracion();
		}
	}
	
	
	
}
