/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pojo;

/**
 *
 * @author chawanvtp
 */
public class account implements java.io.Serializable {
    private int id;
    private String username;
    private String password;
    private String email;
    
    public account(){
        
    }
    
    public account(int id,String username,String password,String email){
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    
    public void edit(int id,String username,String password,String email){
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    @Override
    public String toString(){
        return " ID: "+id+"  Username: "+username+"  Password: "+password+"  Email: "+email;
    }
}
