package com.hengtiansoft.fsm;

/**
 * ActionType
 */
public enum ActionType {

	Handle("H", "处理"), Solve("S", "解决"), Closed("CL", "作废"),Confirm("C", "结单"), Reopen("R", "重新打开"), Transmit("T", "部门转移"), Continue("CTF", "继续流转"), Return("RT", "退回"),ChangeType("CT", "类型修改");

	private String	code;
	private String	label;

	private ActionType(String code, String label) {
		this.code = code;
		this.label = label;
	}

	public static ActionType getItemByCode(String code) {
		for (ActionType type : ActionType.values()) {
			if (type.getCode().equals(code)) {
				return type;
			}
		}
		return null;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

}
