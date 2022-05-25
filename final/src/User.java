/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 이기원
 */
public class User {
    int userNo;
    String userId;
    String userPw;
    String userName;
    
    public void setUserNO(int userNo){
        this.userNo=userNo;
    }
    public void setUserId(String userId){
        this.userId=userId;
    }
    public void setUserPw(String userPw){
        this.userPw=userPw;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    
    public int getUserNo(){
        return this.userNo;
    }
    public String getUserId(){
        return this.userId;
    }
    public String getUserPw(){
        return this.userPw;
    }
    public String getUserName(){
        return this.userName;
    }
}
