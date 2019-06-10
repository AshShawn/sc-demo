/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.rate.model;

/**
 *
 * @author dell
 */
public class User {
    private String uName;//主键
    private String uPwd;
    private String uGender;
    private String uProvince;
    private String uCity;
    private String uContact;
    private String uEmail;
    private String uBirthday;
    private String uPic;

    public User() {
    }

    public User(String uName, String uPwd, String uGender, String uPic) {
        this.uName = uName;
        this.uPwd = uPwd;
        this.uGender = uGender;
        this.uPic = uPic;
    }

    public User(String uName, String uPwd, String uGender) {
        this.uName = uName;
        this.uPwd = uPwd;
        this.uGender = uGender;
    }

    public User(String uName, String uPwd, String uGender, String uProvince, String uCity, String uContact, String uEmail, String uBirthday, String uPic) {
        this.uName = uName;
        this.uPwd = uPwd;
        this.uGender = uGender;
        this.uProvince = uProvince;
        this.uCity = uCity;
        this.uContact = uContact;
        this.uEmail = uEmail;
        this.uBirthday = uBirthday;
        this.uPic = uPic;
    }

    public String getUName() {
        return uName;
    }

    public void setUName(String uName) {
        this.uName = uName;
    }

    public String getUPwd() {
        return uPwd;
    }

    public void setUPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public String getUGender() {
        return uGender;
    }

    public void setUGender(String uGender) {
        this.uGender = uGender;
    }

    public String getUProvince() {
        return uProvince;
    }

    public void setUProvince(String uProvince) {
        this.uProvince = uProvince;
    }

    public String getUCity() {
        return uCity;
    }

    public void setUCity(String uCity) {
        this.uCity = uCity;
    }

    public String getUContact() {
        return uContact;
    }

    public void setUContact(String uContact) {
        this.uContact = uContact;
    }

    public String getUEmail() {
        return uEmail;
    }

    public void setUEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getUBirthday() {
        return uBirthday;
    }

    public void setUBirthday(String uBirthday) {
        this.uBirthday = uBirthday;
    }

    public String getUPic() {
        return uPic;
    }

    public void setUPic(String uPic) {
        this.uPic = uPic;
    }
    
    
    
}
