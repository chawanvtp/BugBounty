/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author chawanvtp
 */
public class AddPostDao {
    
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/arduinodb?zeroDateTimeBehavior=convertToNull";
    private String user = "root";
    private String pass = "123455";
    private Connection connect = null;
    
    public AddPostDao() throws ClassNotFoundException{
        try {
            Class.forName(driver);
            connect = DriverManager.getConnection(url,user,pass);
    } catch (Exception e){
        e.printStackTrace();
    }
    }
    
    public void close() {
 
        try {
 
            if(connect != null) {
 
            connect.close();
 
            }
 
            } catch (Exception e) {
 
                e.printStackTrace();
 
             }
 
    }
    
    public void Add(int idpost, int ownerid, String topic, String target, double bounty){
        String sql = "INTSERT INTO post (ownerid,topic,target,bounty) VALUES ('"+ownerid+"','"+topic+"','"+target+"','"+bounty+"')";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.executeUpdate();
            connect.close();
        } catch (Exception e){
             System.out.println("FAILED at FindAll()");
            e.printStackTrace();
        }
               
    }
    
}
