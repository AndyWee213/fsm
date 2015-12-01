package com.hengtiansoft.fsm;

/**
 * WorkOrderStatus
 */
public enum WorkOrderStatus {

	All("All", "全部"), Pending("P", "待处理"), Handing("H", "处理中"), Solved("S", "已完成"), Confirmed("C", "已结单"), Closed("CL", "已作废");

	private String	code;
	private String	label;

	private WorkOrderStatus(String code, String label) {
		this.code = code;
		this.label = label;
	}

	public static WorkOrderStatus getItemByCode(String code) {
		for (WorkOrderStatus status : WorkOrderStatus.values()) {
			if (status.getCode().equals(code)) {
				return status;
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
