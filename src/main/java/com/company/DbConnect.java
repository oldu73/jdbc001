package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by oldu7 on 11.10.2016.
 */
public class DbConnect {

    private String db_driver;
    private String db_url;
    private String db_user;
    private String db_pass;

    private Connection dbConnection;
    private ResultSet dbResultSet;

    public DbConnect(String db_driver, String db_url, String db_user, String db_pass) {
        this.db_driver = db_driver;
        this.db_url = db_url;
        this.db_user = db_user;
        this.db_pass = db_pass;

        try {
            Class.forName(db_driver).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            dbConnection = DriverManager.getConnection(db_url, db_user, db_pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void executeQuery(String sql) {
        try {
            dbResultSet = dbConnection.createStatement().executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void systemOutResultSetInfo() {
        try {
            for (int i = 0; i < dbResultSet.getMetaData().getColumnCount(); i++) {
                String name = dbResultSet.getMetaData().getColumnName(i + 1);
                String type = dbResultSet.getMetaData().getColumnTypeName(i + 1);

                System.out.println("name: " + name + " / type: " + type);
            }
            System.out.println();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void systemOutResultSetContent() {
        try {
            while (dbResultSet.next()) {
                for (int i = 1; i < dbResultSet.getMetaData().getColumnCount() + 1; i++) {
                    System.out.print(" " + dbResultSet.getMetaData().getColumnName(i) + "=" + dbResultSet.getObject(i));
                }
                System.out.println("");
            }
            System.out.println();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
