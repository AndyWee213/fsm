/**
 * Project Name: fsm
 * File Name: IChatState.java
 * Class Name: IChatState
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.hengtiansoft.eda.chatmachine;

import com.hengtiansoft.eda.Event;

/**
 * @author qwei
 *
 */
public interface IChatState {
	public void broadCast(Event e);
	public void addUser(User user);
	public void removeUser(User user);
}
