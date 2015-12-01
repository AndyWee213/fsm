/**
 * Project Name: fsm
 * File Name: FSMWrapper.java
 * Class Name: FSMWrapper
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
public class FSM extends AbstractState {

	private State curState;

	/**
	 * @return the curState
	 */
	public State getCurState() {
		return curState;
	}

	/**
	 * @param curState the curState to set
	 */
	public void setCurState(State curState) {
		this.curState = curState;
	}

	/* (non-Javadoc)
	 * @see com.hengtiansoft.fsm.State#doAction(com.hengtiansoft.fsm.ActionType)
	 */
	public State doAction(ActionType a) {
		return this.curState.doAction(a);
	}

	public static void main(String[] args) {
		FSM fsm = new FSM();
		// 初始化状态
		fsm.setCurState(new PendingState());
		System.out.println(fsm.curState instanceof PendingState ? true : false);
		// 用户操作--处理中
		fsm.setCurState(fsm.curState.doAction(ActionType.Handle));
		System.out.println(fsm.curState instanceof HandlingState ? true : false);
		// 用户操作--已完成
		fsm.setCurState(fsm.curState.doAction(ActionType.Solve));
		System.out.println(fsm.curState instanceof SolvedState ? true : false);
	}
}
