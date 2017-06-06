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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.pojo.account;

/**
 *
 * @author chawanvtp
 */
public class LoginDao {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3305/arduinodb?zeroDateTimeBehavior=convertToNull";
    private String user = "root";
    private String pass = "aretisd";
    private Connection connect = null;
    
    public LoginDao() throws ClassNotFoundException{
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
    
    /** Login function Login(username,password) -> return model.pojo ACCOUNT
     *  account model includes -> id , username , password , email
     */
    public account Login(String username,String password) throws SQLException{
        String sql = "SELECT * FROM account where username='"+username+"' and password='"+password+"'";
        account user = new account();
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
           
            if(result.next()){
                user.edit(result.getInt("id"),result.getString("username"),result.getString("password"),result.getString("email"));
                
                return user;
            }
        } catch (Exception e){
            System.out.println("Throw at Login function");
            e.printStackTrace();
        }
         
        return null;
    }
    
    
    /*
    public static void main(String[] args) throws SQLException {
        try {
            LoginDao dao = new LoginDao();
            account user = dao.Login("admin", "admin");
            if(user!=null){
            System.out.println(user.toString());
            }else{
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
 
        }
    */
    
}
