package com.kata16.microservice.pojo;

public class FilterConfiguration {
	
	
	private String reference;
	
	private String user;
	
	private Integer tipoAlerta;



	/**
	 * @return the tipoAlerta
	 */
	public Integer getTipoAlerta() {
		return tipoAlerta;
	}

	/**
	 * @param tipoAlerta the tipoAlerta to set
	 */
	public void setTipoAlerta(Integer tipoAlerta) {
		this.tipoAlerta = tipoAlerta;
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
		return "FilterConfiguration [reference=" + reference + ", user=" + user + ", tipoAlerta=" + tipoAlerta + "]";
	}

	
	
	
}
