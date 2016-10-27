package com.microservice.createnotification;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kata16.microservice.pojo.FilterReferenceUser;
import com.kata16.microservice.pojo.Notification;
import com.microservice.createnotification.repository.NotificationRepository;


@RestController
@RequestMapping("/notification")
public class NotificacionController
{

	@Autowired
	NotificationRepository notificationRepository;


	@RequestMapping("/create")
	public Notification create(@RequestBody Notification notification)
	{
		return notificationRepository.insert(notification);

	}


	@RequestMapping("/deleteAll")
	public void deleteAll()
	{

		notificationRepository.deleteAll();

	}


	@RequestMapping("/deleteById")
	public void deleteById(@RequestParam(value = "id") String id)
	{
		notificationRepository.delete(id);
	}


	@RequestMapping("/getById")
	public Notification getById(@RequestParam(value = "id") String id)
	{
		return notificationRepository.findOne(id);
	}


	@RequestMapping("/findAll")
	public List<Notification> getAllNotifications()
	{
		return notificationRepository.findAll();
	}

	@RequestMapping("/findByReferenceUser")
	public List<Notification> findByReferenceUser(@RequestBody FilterReferenceUser filterReferenceUser) 
	
	{
		return notificationRepository.findByReferenceUser(filterReferenceUser.getReference(), filterReferenceUser.getUser());
	}

	@RequestMapping("/update")
	public Notification save(@RequestBody Notification notification)
	{
		return notificationRepository.save(notification);
	}


}
