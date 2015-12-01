/**
 * Project Name: fsm
 * File Name: ChatState.java
 * Class Name: ChatState
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.hengtiansoft.eda.chatmachine;

import java.util.ArrayList;
import java.util.List;

import com.hengtiansoft.eda.Event;

/**
 * @author qwei
 *
 */
public class ChatState implements IChatState {
	private List<User> users;

	/**
	 * @param users
	 */
	public ChatState() {
		this.users = new ArrayList<User>();
	}

	/* (non-Javadoc)
	 * @see com.hengtiansoft.eda.chatmachine.IChatState#broadCast(com.hengtiansoft.eda.Event)
	 */
	@Override
	public void broadCast(Event e) {
		for (User user : users) {
			user.dispatch(e);
		}
	}

	/* (non-Javadoc)
	 * @see com.hengtiansoft.eda.chatmachine.IChatState#addUser(com.hengtiansoft.eda.chatmachine.User)
	 */
	@Override
	public void addUser(User user) {
		users.add(user);
	}

	/* (non-Javadoc)
	 * @see com.hengtiansoft.eda.chatmachine.IChatState#removeUser(com.hengtiansoft.eda.chatmachine.User)
	 */
	@Override
	public void removeUser(User user) {
		users.remove(user);
	}
}
