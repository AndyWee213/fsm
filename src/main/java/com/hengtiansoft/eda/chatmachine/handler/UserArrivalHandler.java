/**
 * Project Name: fsm
 * File Name: UserArrivalHandler.java
 * Class Name: UserArrivalHandler
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
import com.hengtiansoft.eda.chatmachine.event.UserArrival;

/**
 * @author qwei
 *
 */
public class UserArrivalHandler extends BaseChatHandler {

	/**
	 * @param chatState
	 */
	public UserArrivalHandler(ChatState chatState) {
		super(chatState);
	}

	/* (non-Javadoc)
	 * @see com.hengtiansoft.eda.Handler#dispatch(com.hengtiansoft.eda.Event)
	 */
	@Override
	public void dispatch(Event message) {
		User user = ((UserArrival) message).getUser();
		this.chatState.addUser(user);
		System.out.println(user.getName() + " has entered the room.");
	}

}
