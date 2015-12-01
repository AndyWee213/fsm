/**
 * Project Name: fsm
 * File Name: Message.java
 * Class Name: Message
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
public interface Message {
	public Class<? extends Message> getType();
}
