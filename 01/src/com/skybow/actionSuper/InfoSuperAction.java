package com.skybow.actionSuper;

import com.skybow.model.InfoSingle;
import com.skybow.model.SearchInfo;

/**
 * 信息处理基类
 * @author le
 * 2015年6月18日 下午12:37:06
 * 
 */
public class InfoSuperAction extends MySuperAction {
	protected InfoSingle infoSingle;//单条供求信息
	protected SearchInfo searchInfo;//搜索的结果信息

	public InfoSingle getInfoSingle() {
		return infoSingle;
	}

	public void setInfoSingle(InfoSingle infoSingle) {
		this.infoSingle = infoSingle;
	}

	public SearchInfo getSearchInfo() {
		return searchInfo;
	}

	public void setSearchInfo(SearchInfo searchInfo) {
		this.searchInfo = searchInfo;
	}
}
