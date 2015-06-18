package com.skybow.model;

/**
 * 搜索信息Model
 * @author le
 * 2015年6月18日 下午12:31:58
 * 
 */
public class SearchInfo {
	private String subsql;
	private String sqlvalue;
	private String type="all";

	public String getSqlvalue() {
		return sqlvalue;
	}
	public void setSqlvalue(String sqlvalue) {
		this.sqlvalue = sqlvalue;
	}
	public String getSubsql() {
		return subsql;
	}
	public void setSubsql(String subsql) {
		this.subsql = subsql;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}	
}
