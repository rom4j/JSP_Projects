package com.skybow.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.skybow.actionForm.PublishingForm;
import com.skybow.core.ConnDB;

public class PublishingDAO {
    private ConnDB conn=new ConnDB();
//²éÑ¯Êý¾Ý
public Collection query(String strif){
PublishingForm pubForm=null;
Collection pubColl=new ArrayList();
String sql="";
if(strif!="all" && strif!=null && strif!=""){
    sql="select * from tb_publishing where "+strif+"";
}else{
    sql="select * from tb_publishing";
}
ResultSet rs=conn.executeQuery(sql);
try {
    while (rs.next()) {
        pubForm=new PublishingForm();
        pubForm.setIsbn(rs.getString(1));
        pubForm.setPubname(rs.getString(2));
        pubColl.add(pubForm);
    }
} catch (SQLException ex) {
}
conn.close();
return pubColl;
}

}
