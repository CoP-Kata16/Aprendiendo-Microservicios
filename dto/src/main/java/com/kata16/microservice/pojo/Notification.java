package com.kata16.microservice.pojo;


import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;


@XmlRootElement(name = "notification")
public class Notification
{
	@Id
	private String id;

	private String idType;

	private String title;

	private String description;

	private String reference;
	
	private String user;
	



	/**
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}


	/**
	 * @return the idTypo
	 */
	public String getIdType()
	{
		return idType;
	}


	/**
	 * @param idTypo the idTypo to set
	 */
	public void setIdType(String idType)
	{
		this.idType = idType;
	}


	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}


	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}


	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}


	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}


	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}


	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Notification [id=" + id + ", idType=" + idType + ", title=" + title + ", description=" + description
				+ ", reference=" + reference + ", user=" + user + "]";
	}


	
	

}
