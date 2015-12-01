/**
 * Project Name: fsm
 * File Name: Events.java
 * Class Name: Events
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
public class Event implements Message {

	/* (non-Javadoc)
	 * @see eda.Message#getType()
	 */
	@Override
	public Class<? extends Message> getType() {
		return getClass();
	}

}
