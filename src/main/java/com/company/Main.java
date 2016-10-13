package com.company;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        System.out.println();
        System.out.println("Hello, world!");
        System.out.println();

        // DB
        String DB1_DRIVER = "com.mysql.jdbc.Driver";
        String DB1_URL = "jdbc:mysql://192.168.1.147";
        String DB1_USER = "oldu";
        String DB1_PASS = "oldu";
        String DB1_SQL = "SELECT * from dbtest001.tabletest001";
        //String DB1_SQL = "show databases";
        //String DB1_SQL = "show tables from test001";

        DbConnect dbConnect1 = new DbConnect(DB1_DRIVER, DB1_URL, DB1_USER, DB1_PASS);
        dbConnect1.executeQuery(DB1_SQL);
        dbConnect1.systemOutResultSetInfo();
        dbConnect1.systemOutResultSetContent();

        // DB
        String DB2_DRIVER = "com.mysql.jdbc.Driver";
        String DB2_URL = "jdbc:mysql://192.168.1.149";
        String DB2_USER = "oldu";
        String DB2_PASS = "oldu";
        String DB2_SQL = "SELECT * from dbtest002.tabletest002";
        //String DB2_SQL = "show databases";
        //String DB2_SQL = "show tables from dbtest002";

        DbConnect dbConnect2 = new DbConnect(DB2_DRIVER, DB2_URL, DB2_USER, DB2_PASS);
        dbConnect2.executeQuery(DB2_SQL);
        dbConnect2.systemOutResultSetInfo();
        dbConnect2.systemOutResultSetContent();

        // DB
        String DB3_DRIVER = "org.postgresql.Driver";
        String DB3_URL = "jdbc:postgresql://192.168.1.139/test1";
        String DB3_USER = "test1";
        String DB3_PASS = "test1";
        String DB3_SQL = "SELECT * FROM public.playground";
        //String DB3_SQL = "show databases";
        //String DB3_SQL = "show tables from dbtest002";

        DbConnect dbConnect3 = new DbConnect(DB3_DRIVER, DB3_URL, DB3_USER, DB3_PASS);
        dbConnect3.executeQuery(DB3_SQL);
        dbConnect3.systemOutResultSetInfo();
        dbConnect3.systemOutResultSetContent();
    }
}
