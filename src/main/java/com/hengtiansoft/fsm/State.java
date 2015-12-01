/**
 * Project Name: fsm
 * File Name: State.java
 * Class Name: State
 *
 * Copyright 2014 Hengtian Software Inc
 *
 * Licensed under the Hengtiansoft - http://www.hengtiansoft.com
 *
 */
package com.hengtiansoft.fsm;

/**
 * @author qwei
 *
 */
public interface State {
	public State doAction(ActionType a);
}
