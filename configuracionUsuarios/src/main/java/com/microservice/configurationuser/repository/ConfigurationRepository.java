package com.microservice.configurationuser.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.kata16.microservice.pojo.Configuracion;


public interface ConfigurationRepository extends MongoRepository<Configuracion, String>
{
	@Query("{'tipoAlerta':?0, 'referencia':?1, 'usuario':?2}")
	Configuracion findByReferenceUser(Integer type, String reference, String user);	
}
	

