/**
 * Project Name: fsm
 * File Name: DynamicRouter.java
 * Class Name: DynamicRouter
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.hengtiansoft.eda;

/**
 * @author qwei
 *
 */
public interface DynamicRouter<E extends Message> {
	public void registerChannel(Class<? extends E> contentType, Channel<? extends E> channel);
	public void dispatch(E content);
}
