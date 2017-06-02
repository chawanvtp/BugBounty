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
import model.pojo.post;

/**
 *
 * @author chawanvtp
 */
public class PostDao {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/arduinodb?zeroDateTimeBehavior=convertToNull";
    private String user = "root";
    private String pass = "123455";
    private Connection connect = null;
    
    public PostDao(){
        try {
            Class.forName(driver);
            connect = DriverManager.getConnection(url, user, pass);
    } catch (Exception e){
        e.printStackTrace();
        System.out.println("FAILED at PostDao()");
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
    
    public List<post> findAll() throws SQLException{
        String sql = "SELECT * FROM post";
        List<post> postList = new ArrayList<post>();
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            while(result.next()){
                post curpost = new post(result.getInt("idpost"),result.getInt("ownerid"),result.getString("topic"),result.getString("target"),result.getDouble("bounty"),result.getString("detail"));
                postList.add(curpost);
            }
            connect.close();
        } catch (Exception e){
             System.out.println("FAILED at FindAll()");
            e.printStackTrace();
        }
         
        return postList;
    }
    
    public post find(int pid) throws SQLException{
        String sql = "SELECT * FROM post where idpost="+pid;
        post curpost = new post();
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            while(result.next()){
                curpost = new post(result.getInt("idpost"),result.getInt("ownerid"),result.getString("topic"),result.getString("target"),result.getDouble("bounty"),result.getString("detail"));
            }
            connect.close();
        } catch (Exception e){
             System.out.println("FAILED at FindAll()");
            e.printStackTrace();
        }
         
        return curpost;
    }
    
    
    public static void main(String[] args) throws SQLException{
        PostDao dao = new PostDao();
        List<post> pList = dao.findAll();
        for(post p : pList){
            System.out.print(p.toString());
        }
     }
    
}