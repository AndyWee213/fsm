/**
 * Project Name: fsm
 * File Name: AbstractState.java
 * Class Name: AbstractState
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
public abstract class AbstractState implements State {
	protected State doHandle() {
		System.out.println("用户操作--处理中");
		return new HandlingState();
	}

	protected State doSolve() {
		System.out.println("用户操作--已完成");
		return new SolvedState();
	}
	
	protected State doDeny() {
		System.out.println("不能接受此类型操作");
		return null;
	}
}
