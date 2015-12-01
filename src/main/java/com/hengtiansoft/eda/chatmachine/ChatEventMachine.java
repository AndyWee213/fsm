/**
 * Project Name: fsm
 * File Name: ChatEventMachine.java
 * Class Name: ChatEventMachine
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.hengtiansoft.eda.chatmachine;

import java.util.LinkedList;
import java.util.Queue;

import com.hengtiansoft.eda.Event;
import com.hengtiansoft.eda.EventDispatcher;
import com.hengtiansoft.eda.chatmachine.event.UserArrival;
import com.hengtiansoft.eda.chatmachine.event.UserDeparture;
import com.hengtiansoft.eda.chatmachine.event.UserMessage;
import com.hengtiansoft.eda.chatmachine.handler.UserArrivalHandler;
import com.hengtiansoft.eda.chatmachine.handler.UserDepartureHandler;
import com.hengtiansoft.eda.chatmachine.handler.UserMessageHandler;

/**
 * @author qwei
 *
 */
public class ChatEventMachine {
	public static void main(String[] args) {
		EventDispatcher dispatcher = new EventDispatcher();
		ChatState chatState = new ChatState();
		Queue<Event> eventQueue = new LinkedList<Event>();

		dispatcher.registerChannel(UserArrival.class, new UserArrivalHandler(
				chatState));
		dispatcher.registerChannel(UserDeparture.class,
				new UserDepartureHandler(chatState));
		dispatcher.registerChannel(UserMessage.class, new UserMessageHandler(
				chatState));

		// Initialize users
		User foo = new User(eventQueue, "foo");
		User bar = new User(eventQueue, "bar");
		dispatcher.dispatch(new UserArrival(foo));
		dispatcher.dispatch(new UserArrival(bar));

		// Enqueue events from individual users
		foo.sendMessage("hello, bar!");
		bar.sendMessage("hello, foo!");
		foo.sendMessage("goodbye, bar!");

		while (!eventQueue.isEmpty()) {
			Event evt = eventQueue.remove();
			dispatcher.dispatch(evt);
		}

		// Finish up simulation
		dispatcher.dispatch(new UserDeparture(foo));
		dispatcher.dispatch(new UserDeparture(bar));
	}
}
