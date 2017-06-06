/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.pojo.account;
import model.pojo.comment;
import model.pojo.post;
/**
 *
 * @author chawanvtp
 */
public class ThreadDao {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3305/arduinodb?zeroDateTimeBehavior=convertToNull";
    private String user = "root";
    private String pass = "aretisd";
    private Connection connect = null;
    
     public ThreadDao() throws ClassNotFoundException{
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
    
    public List<comment> findAll(int postid) throws SQLException{
        String sql = "SELECT * FROM comment where postID="+postid;
        List<comment> commentList = new ArrayList<comment>();
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            while(result.next()){
                comment curComment = new comment(result.getInt("commentID"),result.getInt("postID"),result.getString("detail"),result.getInt("userID"),result.getString("userName"));
                commentList.add(curComment);
            }
            connect.close();
        } catch (Exception e){
             System.out.println("FAILED at FindAll()");
            e.printStackTrace();
        }
         
        return commentList;
        
    }
    
    
    
}
