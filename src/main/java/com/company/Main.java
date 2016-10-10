package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        // DB
        String DB_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://192.168.1.147";
        String DB_USER = "oldu";
        String DB_PASS = "oldu";
        String DB_SQL = "SELECT * from test001.test001";
        //String DB_SQL = "show databases";
        //String DB_SQL = "show tables from test001";

        System.out.println();
        System.out.println("Hello, world!");
        System.out.println();

        Class.forName(DB_DRIVER).newInstance();
        Connection dbConnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        ResultSet dbResultSet = dbConnection.createStatement().executeQuery(DB_SQL);

        for (int i = 0; i < dbResultSet.getMetaData().getColumnCount(); i++) {
            String name = dbResultSet.getMetaData().getColumnName(i + 1);
            String type = dbResultSet.getMetaData().getColumnTypeName(i + 1);

            System.out.println("name: " + name + " / type: " + type);
        }

        System.out.println();

        while (dbResultSet.next()) {
            for (int i = 1; i < dbResultSet.getMetaData().getColumnCount() + 1; i++) {
                System.out.print(" " + dbResultSet.getMetaData().getColumnName(i) + "=" + dbResultSet.getObject(i));
            }
            System.out.println("");
        }
    }
}
