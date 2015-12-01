/**
 * Project Name: fsm
 * File Name: Handler.java
 * Class Name: Handler
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.hengtiansoft.eda;

/**
 * @author qwei
 *
 */
public class Handler implements Channel<Event> {

	/* (non-Javadoc)
	 * @see eda.Channel#dispatch(eda.Message)
	 */
	@Override
	public void dispatch(Event message) {
		System.out.println(message.getClass());
	}
}
