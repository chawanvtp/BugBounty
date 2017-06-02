/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pojo;
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
public class comment {
    private int commentID;
    private int userID;
    private int postID;
    private String detail;
    private String userName;
    
    public comment(int commentID ,int postID  ,String detail ,int userID ,String userName){
        this.commentID = commentID;
        this.userID = userID;
        this.postID = postID;
        this.detail = detail;
        this.userName = userName;
    }

    public int getCommentID() {
        return commentID;
    }

    public int getUserID() {
        return userID;
    }

    public int getPostID() {
        return postID;
    }

    public String getDetail() {
        return detail;
    }

    public String getUserName() {
        return userName;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public void setDetial(String detail) {
        this.detail = detail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
}
