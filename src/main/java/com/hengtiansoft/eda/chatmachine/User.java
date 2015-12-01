/**
 * Project Name: fsm
 * File Name: User.java
 * Class Name: User
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.hengtiansoft.eda.chatmachine;

import java.util.Queue;

import com.hengtiansoft.eda.Event;
import com.hengtiansoft.eda.chatmachine.event.UserMessage;

/**
 * @author qwei
 *
 */
public class User {
	private String name;
	private Queue<Event> eventQueue;
	/**
	 * @param eventQueue
	 * @param name
	 */
	public User(Queue<Event> eventQueue, String name) {
		this.eventQueue = eventQueue;
		this.name = name;
	}


	public void dispatch(Event e) {
		if (e.getClass() == UserMessage.class) {
			UserMessage userMessage = (UserMessage) e;
			processMessage(userMessage.getUser(), userMessage.getMessage());
		}

	}

	private void processMessage(User user, String message) {
		if (this.equals(user)) {
			return;
		} else {
			System.out.println(user.getName() + ": " + message);
		}
	}

	public void sendMessage(String message){
		eventQueue.add(new UserMessage(this, message));
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
