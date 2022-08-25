package com.PatikaTurizm.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    public Connection connectDb(){
        Connection connect;
        try {
            connect = DriverManager.getConnection(Config.DB_URL,Config.DB_USERNAME,Config.DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connect;
    }

    public static Connection getInstance(){
        DBConnector db = new DBConnector();
        return db.connectDb();
    }
}
