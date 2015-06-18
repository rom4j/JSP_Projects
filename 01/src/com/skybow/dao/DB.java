package com.skybow.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 数据库操作工具类
 * @author le
 * getCon()获取数据库连接,closed()关闭数据库连接,doPstm()增删改查操作
 */
public class DB {
	private Connection con;
	private PreparedStatement pstm;
	//----数据库连接参数设置----
	/**
	 * 用户名
	 */
	private String user="root";
	/**
	 * 用户密码
	 */
	private String password="3171204";
	/**
	 *驱动类名
	 *	mysql 		com.mysql.jdbc.Driver
	 *	sqlserver 	com.microsoft.sqlserver.jdbc.SQLServerDriver
	 *	oracle		oracle.jdbc.driver.OracleDriver
	 */
	private String className="com.mysql.jdbc.Driver";
	/**
	 * 数据库URL
	 * mysql		jdbc:mysql://127.0.0.1:3306/db_wymedia?useUnicode=true&characterEncoding=UTF-8
	 * sqlserver	jdbc:sqlserver://localhost:1433;DatabaseName=db_wymedia
	 * oracle 		jdbc:oracle:thin:@localhost:1521:orcl
	 */
	private String url="jdbc:mysql://127.0.0.1:3306/db_wymedia?useUnicode=true&characterEncoding=UTF-8";
	
	/**
	 * 构造器
	 * 	类加载初始化
	 */
	public DB(){
		try{
			Class.forName(className);
		}catch(ClassNotFoundException e){
			System.out.println("加载数据库驱动失败！");
			e.printStackTrace();
		}
	}

	
	/**
	 * 创建数据库连接
	 * 	获取数据连接
	 * @return Connection
	 */
	public Connection getCon(){
		try {
			con=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			System.out.println("创建数据库连接失败！");
			con=null;
			e.printStackTrace();
		}
		return con;
	}
	
	/**
	 * 执行数据增删改查操作
	 * @param sql
	 * @param params
	 */
	public void doPstm(String sql,Object[] params){
		if(sql!=null&&!sql.equals("")){
			if(params==null)
				params=new Object[0];
			
			getCon();
			if(con!=null){
				try{		
					System.out.print("---->sql--"+sql);
					pstm=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
					for(int i=0;i<params.length;i++){
						System.out.print("--"+params[i]+",");
						pstm.setObject(i+1,params[i]);
					}
					System.out.println();
					pstm.execute();
				}catch(SQLException e){
					System.out.println("doPstm()方法出错！");
					e.printStackTrace();
				}				
			}			
		}
	}
	
	/**
	 * 获取结果集
	 * @return
	 * @throws SQLException
	 */
	public ResultSet getRs() throws SQLException{
		return pstm.getResultSet();		
	}
	/**
	 * Retrieves the current result as an update count; 
	 * if the result is a ResultSet object or there are no more results, -1 is returned. This method should be called only once per result.
	 * @return
	 * @throws SQLException
	 */
	public int getCount() throws SQLException{
		return pstm.getUpdateCount();		
	}
	/**
	 * 关闭连接
	 */
	public void closed(){
		try{
			if(pstm!=null)
				pstm.close();			
		}catch(SQLException e){
			System.out.println("关闭pstm对象失败！");
			e.printStackTrace();
		}
		try{
			if(con!=null){
				con.close();
			}
		}catch(SQLException e){
			System.out.println("关闭con对象失败！");
			e.printStackTrace();
		}
	}
}
