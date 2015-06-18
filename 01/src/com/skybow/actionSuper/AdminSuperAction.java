package com.skybow.actionSuper;

import com.skybow.model.AdminShowType;
import com.skybow.model.InfoSingle;

/**
 * 管理员后台Action基类
 * @author le
 * 2015年6月18日 下午12:38:18
 * 
 */
public class AdminSuperAction extends MySuperAction {
	protected AdminShowType showType;
	protected InfoSingle infoSingle;

	public AdminSuperAction() {
		showType = new AdminShowType();
		infoSingle = new InfoSingle();
	}

	public AdminShowType getShowType() {
		return showType;
	}

	public void setShowType(AdminShowType showType) {
		this.showType = showType;
	}

	public InfoSingle getInfoSingle() {
		return infoSingle;
	}

	public void setInfoSingle(InfoSingle infoSingle) {
		this.infoSingle = infoSingle;
	}
}
