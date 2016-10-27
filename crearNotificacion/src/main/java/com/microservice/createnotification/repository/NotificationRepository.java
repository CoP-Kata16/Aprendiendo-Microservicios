package com.microservice.createnotification.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.kata16.microservice.pojo.Notification;


public interface NotificationRepository extends MongoRepository<Notification, String>
{

	@Query("{'reference':?0, 'user':?1}")
	List<Notification> findByReferenceUser(String reference, String user);
	 
	 
}
