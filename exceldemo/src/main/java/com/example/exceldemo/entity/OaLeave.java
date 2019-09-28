package com.example.exceldemo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 请假申请表实体类
 *
 */
public class OaLeave implements Serializable {

	private static final long serialVersionUID = -6422486736388536895L;

	private Integer leaveId;
	private Date addDate;// 创建时间
	private String deeply;// 紧急程度
	private String auditInfo;// 审批信息*
	private Integer currentNode;// 审批节点
	private Integer empId;// 员工id
	private String empName;// 员工姓名
	private Date endDate;// 结束时间
	private Date startDate;// 开始时间
	private Integer fid;
	private String reason;// 原因
	private String remark;
	private String state;// 流程状态(暂不使用)
	private String title;// 标题
	private Double tolol;// 请假时间
	private String type;// 流程类型
	private String auditState;// 审批状态
	private String shenuser;// 审核人

	public String getShenuser() {
		return shenuser;
	}

	public void setShenuser(String shenuser) {
		this.shenuser = shenuser;
	}

	public Integer getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public String getDeeply() {
		return deeply;
	}

	public void setDeeply(String deeply) {
		this.deeply = deeply;
	}

	public String getAuditInfo() {
		return auditInfo;
	}

	public void setAuditInfo(String auditInfo) {
		this.auditInfo = auditInfo;
	}

	public Integer getCurrentNode() {
		return currentNode;
	}

	public void setCurrentNode(Integer currentNode) {
		this.currentNode = currentNode;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getTolol() {
		return tolol;
	}

	public void setTolol(Double tolol) {
		this.tolol = tolol;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuditState() {
		return auditState;
	}

	public void setAuditState(String auditState) {
		this.auditState = auditState;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((leaveId == null) ? 0 : leaveId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof OaLeave))
			return false;
		OaLeave other = (OaLeave) obj;
		if (leaveId == null) {
			if (other.leaveId != null)
				return false;
		} else if (!leaveId.equals(other.leaveId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OaLeave [leaveId=" + leaveId + ", addDate=" + addDate + ", deeply=" + deeply + ", auditInfo="
				+ auditInfo + ", currentNode=" + currentNode + ", empId=" + empId + ", empName=" + empName
				+ ", endDate=" + endDate + ", startDate=" + startDate + ", fid=" + fid + ", reason=" + reason
				+ ", remark=" + remark + ", state=" + state + ", title=" + title + ", tolol=" + tolol + ", type=" + type
				+ ", auditState=" + auditState + ", shenuser=" + shenuser + "]";
	}

}
