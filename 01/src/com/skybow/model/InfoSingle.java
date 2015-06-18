package com.skybow.model;

/**
 * 供求信息Model
 * @author le
 * 2015年6月18日 下午12:32:33
 * 
 */
public class InfoSingle {
	private int id;//ID
	private int infoType;//信息分类
	private String infoTitle;//信息标题
	private String infoContent;//信息内容
	private String infoLinkman;//联系人
	private String infoPhone;//联系电话
	private String infoEmail;//联系邮箱
	private String infoDate; //发布时间
	private String infoState;//发布状态
	private String infoPayfor;//是否付费
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInfoContent() {
		return infoContent;
	}
	public void setInfoContent(String infoContent) {
		this.infoContent = infoContent;
	}
	public String getInfoDate() {
		return infoDate;
	}
	public void setInfoDate(String infoDate) {
		this.infoDate = infoDate;
	}
	public String getInfoLinkman() {
		return infoLinkman;
	}
	public void setInfoLinkman(String infoLinkman) {
		this.infoLinkman = infoLinkman;
	}
	public String getInfoPayfor() {
		return infoPayfor;
	}
	public void setInfoPayfor(String infoPayfor) {
		this.infoPayfor = infoPayfor;
	}
	public String getInfoPhone() {
		return infoPhone;
	}
	public void setInfoPhone(String infoPhone) {
		this.infoPhone=infoPhone;
	}	
	public String getInfoEmail() {		
		return infoEmail;
	}
	public void setInfoEmail(String infoEmail) {
		this.infoEmail = infoEmail;
	}
	public String getInfoState() {
		return infoState;
	}
	public void setInfoState(String infoState) {
		this.infoState = infoState;
	}
	public String getInfoTitle() {
		return infoTitle;
	}
	public void setInfoTitle(String infoTitle) {
		this.infoTitle = infoTitle;
	}
	public int getInfoType() {
		return infoType;
	}
	public void setInfoType(int infoType) {
		this.infoType = infoType;
	}
	/**
	 * TODO 这个方法不知道是什么意思
	 * @param len
	 * @return
	 */
	public String getSubInfoTitle(int len){
		if(len<=0||len>this.infoTitle.length())
			len=this.infoTitle.length();
		return this.infoTitle.substring(0,len);		
	}
}
