/**
 * Project Name: fsm
 * File Name: UserDepartureHandler.java
 * Class Name: UserDepartureHandler
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.hengtiansoft.eda.chatmachine.handler;

import com.hengtiansoft.eda.Event;
import com.hengtiansoft.eda.chatmachine.ChatState;
import com.hengtiansoft.eda.chatmachine.User;
import com.hengtiansoft.eda.chatmachine.event.UserDeparture;

/**
 * @author qwei
 *
 */
public class UserDepartureHandler extends BaseChatHandler {

	/**
	 * @param chatState
	 */
	public UserDepartureHandler(ChatState chatState) {
		super(chatState);
	}

	/* (non-Javadoc)
	 * @see com.hengtiansoft.eda.Handler#dispatch(com.hengtiansoft.eda.Event)
	 */
	@Override
	public void dispatch(Event message) {
		User user = ((UserDeparture)message).getUser();
		this.chatState.removeUser(user);
		System.out.println(user.getName() + " has left the room.");
	}

}
