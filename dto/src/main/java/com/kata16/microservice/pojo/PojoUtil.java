package com.kata16.microservice.pojo;

public class PojoUtil {

	public static FilterConfiguration createFilterConfiguration(final Configuracion configuracion) {
		FilterConfiguration filter = new FilterConfiguration();
		filter.setReference(configuracion.getReferencia());
		filter.setTipoAlerta(configuracion.getTipoAlerta());
		filter.setUser(configuracion.getUsuario());
		return filter;
	}

	public static FilterConfiguration createFilterConfiguration(Notification notification) {
		FilterConfiguration filter = new FilterConfiguration();
		filter.setReference(notification.getReference());
		filter.setTipoAlerta(Integer.valueOf(notification.getIdType()));
		filter.setUser(notification.getUser());
		return filter;
	}

	public static Configuracion createDefaultConfiguration(Notification notification) {
		Configuracion configDefault = new Configuracion();
		configDefault.setReferencia(notification.getReference());
		configDefault.setTipoAlerta(Integer.valueOf(notification.getIdType()));
		configDefault.setUsuario(notification.getUser());
		configDefault.setActiva(Boolean.TRUE);
		return configDefault;
	}
	
	
	public static Notification notificationNotCreated(Notification notification) {
		notification.setTitle("Notificacion no creada");
		notification.setDescription("Notificacion no activada para la ref/usuario indicada");
		return notification;
	}
}
