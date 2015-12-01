/**
 * Project Name: fsm
 * File Name: UserDeparture.java
 * Class Name: UserDeparture
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
public class UserDeparture extends Event {
	private User user;

	/**
	 * @param user
	 */
	public UserDeparture(User user) {
		this.user = user;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
}
