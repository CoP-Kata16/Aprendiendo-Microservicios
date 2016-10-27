package com.kata16.microservice.pojo;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;

@XmlRootElement(name = "configuracion")
public class Configuracion {

	@Id
	private String id;
	
	private String referencia;
	
	private String usuario;
	
	private Integer tipoAlerta;
	
	private Boolean activa;
	

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the referencia
	 */
	public String getReferencia() {
		return referencia;
	}

	/**
	 * @param referencia the referencia to set
	 */
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

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
	 * @return the activa
	 */
	public Boolean getActiva() {
		return activa;
	}

	/**
	 * @param activa the activa to set
	 */
	public void setActiva(Boolean activa) {
		this.activa = activa;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("Configuracion [id=").append(id).append(", referencia=").append(referencia).append(", usuario=").append(usuario).append(", tipoAlerta=").append(tipoAlerta).append(", activa=").append(activa.toString()).append("]");
		
		return builder.toString();
		
	}
	
}
