/**
 * Project Name: fsm
 * File Name: PendingState.java
 * Class Name: PendingState
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
public class PendingState extends AbstractState {

	/* (non-Javadoc)
	 * @see com.hengtiansoft.fsm.State#doAction(com.hengtiansoft.fsm.Event)
	 */
	public State doAction(ActionType e) {
		State result = null;
		switch (e.getCode()) {
		case "T":
			System.out.println("用户操作--部门转移");
			result = new HandlingState();
			break;
		case "H":
			result = doHandle();
			break;			
		case "S":
			result = doSolve();
			break;
		default:
			result = doDeny();
			break;
		}
		return result;

	}

}
