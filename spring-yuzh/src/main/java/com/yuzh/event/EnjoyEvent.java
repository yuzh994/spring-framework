package com.yuzh.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

public class EnjoyEvent extends ApplicationEvent {

	private static final long serialVersionUID = 440411352037374114L;


	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public EnjoyEvent(Object source) {
		super(source);
	}


}
