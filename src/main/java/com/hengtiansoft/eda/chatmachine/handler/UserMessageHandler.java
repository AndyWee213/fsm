/**
 * Project Name: fsm
 * File Name: UserMessageHandler.java
 * Class Name: UserMessageHandler
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.hengtiansoft.eda.chatmachine.handler;

import com.hengtiansoft.eda.Event;
import com.hengtiansoft.eda.chatmachine.ChatState;

/**
 * @author qwei
 *
 */
public class UserMessageHandler extends BaseChatHandler {

	/**
	 * @param chatState
	 */
	public UserMessageHandler(ChatState chatState) {
		super(chatState);
	}

	/* (non-Javadoc)
	 * @see com.hengtiansoft.eda.Handler#dispatch(com.hengtiansoft.eda.Event)
	 */
	@Override
	public void dispatch(Event message) {
		this.chatState.broadCast(message);
	}

}
