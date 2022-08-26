package com.PatikaTurizm.model;

import com.PatikaTurizm.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private int id;
    private String name;
    private String userName;
    private String pass;
    private String type;

    public User() {}

    public User(int id, String name, String userName, String pass, String type) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.pass = pass;
        this.type = type;
    }

    public static User getFetch(String userName , String pass) {
        User user = new User();
        String sql = "SELECT * FROM user WHERE user_name = ? AND password = ?";

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(sql);
            pr.setString(1,userName);
            pr.setString(2,pass);
            ResultSet rs = pr.executeQuery();
            if (rs.next()){
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setUserName(rs.getString("user_name"));
                user.setPass(rs.getString("password"));
                user.setType(rs.getString("type"));
                return user;
            } else
                return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
