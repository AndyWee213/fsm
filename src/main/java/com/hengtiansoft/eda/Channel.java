/**
 * Project Name: fsm
 * File Name: Channel.java
 * Class Name: Channel
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
public interface Channel<E extends Message> {
	public void dispatch(E message);
}
