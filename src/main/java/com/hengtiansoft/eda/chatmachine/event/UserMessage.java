/**
 * Project Name: fsm
 * File Name: UserMessage.java
 * Class Name: UserMessage
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
public class UserMessage extends Event {
	private User user;
	private String message;
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user
	 * @param message
	 */
	public UserMessage(User user, String message) {
		this.user = user;
		this.message = message;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
