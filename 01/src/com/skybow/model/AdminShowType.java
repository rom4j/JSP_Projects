package com.skybow.model;

/**
 * 后台管理展示Model
 * @author le
 * 2015年6月18日 下午12:38:46
 * 
 */
public class AdminShowType {
	private String stateType;//审核状态:0未审核,1审核
	private String payforType;//付款状态:0未付款,1付款 
	private int infoType;//信息分类

	public String getPayforType() {
		return payforType;
	}
	public void setPayforType(String payforType) {
		this.payforType = payforType;
	}
	public String getStateType() {
		return stateType;
	}
	public void setStateType(String stateType) {
		this.stateType = stateType;
	}
	public int getInfoType() {
		return infoType;
	}
	public void setInfoType(int infoType) {
		this.infoType = infoType;
	}	
}
