/**
 * Project Name: fsm
 * File Name: EventDispatcher.java
 * Class Name: EventDispatcher
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.hengtiansoft.eda;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qwei
 *
 */
public class EventDispatcher implements DynamicRouter<Event> {

	private Map<Class<? extends Event>, Handler> handlers;

	/**
	 * @param handlers
	 */
	public EventDispatcher() {
		handlers = new HashMap<Class<? extends Event>, Handler>();
	}

	/* (non-Javadoc)
	 * @see eda.DynamicRouter#registerChannel(java.lang.Class, java.lang.Class)
	 */
	@Override
	public void registerChannel(Class<? extends Event> contentType,
			Channel<? extends Event> channel) {
		handlers.put(contentType, (Handler)channel);
	}

	/* (non-Javadoc)
	 * @see eda.DynamicRouter#dispatch(eda.Message)
	 */
	@Override
	public void dispatch(Event content) {
		handlers.get(content.getClass()).dispatch(content);
	}

}
