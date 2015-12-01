/**
 * Project Name: fsm
 * File Name: HandlingEvent.java
 * Class Name: HandlingEvent
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.hengtiansoft.eda.chatmachine.event;

import com.hengtiansoft.eda.Event;
import com.hengtiansoft.eda.chatmachine.User;

/**
 * @author qwei
 *
 */
public class UserArrival extends Event {
	private User user;

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 */
	public UserArrival(User user) {
		this.user = user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
}
