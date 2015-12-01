/**
 * Project Name: fsm
 * File Name: HandlingState.java
 * Class Name: HandlingState
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
public class HandlingState extends AbstractState {

	/* (non-Javadoc)
	 * @see com.hengtiansoft.fsm.State#doAction(com.hengtiansoft.fsm.ActionType)
	 */
	public State doAction(ActionType a) {
		State result = null;
		switch (a.getCode()) {
		case "H":
			result = doHandle();
			break;			
		case "S":
			result = doSolve();
			break;
		default:
			System.out.println("不能接受此类型操作");
			break;
		}
		return result;
		// TODO Auto-generated method stub

	}

}
