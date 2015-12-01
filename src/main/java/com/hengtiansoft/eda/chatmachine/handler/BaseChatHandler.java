/**
 * Project Name: fsm
 * File Name: BaseChatHandler.java
 * Class Name: BaseChatHandler
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.hengtiansoft.eda.chatmachine.handler;

import com.hengtiansoft.eda.Handler;
import com.hengtiansoft.eda.chatmachine.ChatState;

/**
 * @author qwei
 *
 */
public abstract class BaseChatHandler extends Handler {
	protected ChatState chatState;

	/**
	 * @param chatState
	 */
	public BaseChatHandler(ChatState chatState) {
		super();
		this.chatState = chatState;
	}

}
