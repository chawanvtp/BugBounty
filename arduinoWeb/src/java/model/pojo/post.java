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
public class post {
    private int idpost;
    private int ownerid;
    private String detail;
    private String topic;
    private String target;
    private double bounty;
    
    
    public post(){
        
    }
    
    public post(int idpost,int ownerid,String topic,String target,double bounty,String detail){
        this.idpost = idpost;
        this.topic = topic;
        this.target = target;
        this.ownerid = ownerid;
        this.detail = detail;
        this.bounty = bounty;
    }
    
    public int getId(){
        return this.idpost;
    }
    
    public void setId(int idpost){
        this.idpost = idpost;
    }
    
    public double getBounty(){
        return this.bounty;
    }
    
    public void setBounty(double bounty){
        this.bounty = bounty;
    }
    
    public String getDetail(){
        return this.detail;
    }
    
    public void setDetail(String detail){
        this.detail = detail;
    }
    
    public int getOwnerid(){
        return this.ownerid;
    }
    
    public void setOwnerid(int ownerid){
        this.ownerid = ownerid;
    }
    
    public String getTopic(){
        return this.topic;
    }
    public void setTopic(String topic){
        this.topic = topic;
    }
    
    public String getTarget(){
        return this.target;
    }
    
    public void setTarget(String target){
        this.target = target;
    }
    
    
    @Override
    public String toString(){
        return "POST-ID: "+idpost+"  OwnerID: "+ownerid+"\n Topic: "+topic+"\n Target: "+target+"\n Bounty: "+bounty+"$\n Detail--: "+detail+"\n";
    }
}
