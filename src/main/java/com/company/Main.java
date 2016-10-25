package com.company;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        System.out.println();
        System.out.println("Hello, world!");
        System.out.println();

        // mysql1
        String DB1_DRIVER = "com.mysql.jdbc.Driver";
        String DB1_URL = "jdbc:mysql://192.168.1.114";
        String DB1_USER = "oldu";
        String DB1_PASS = "oldu";
        String DB1_SQL = "SELECT * from dbtest.tabletest";
        //String DB1_SQL = "show databases";
        //String DB1_SQL = "show tables from test001";

        DbConnect dbConnect1 = new DbConnect(DB1_DRIVER, DB1_URL, DB1_USER, DB1_PASS);
        dbConnect1.executeQuery(DB1_SQL);
        dbConnect1.systemOutResultSetInfo();
        dbConnect1.systemOutResultSetContent();
        dbConnect1.close();

        // #################################################################################

        // mysql1, 2ième DB
        String DB11_DRIVER = "com.mysql.jdbc.Driver";
        String DB11_URL = "jdbc:mysql://192.168.1.114";
        String DB11_USER = "oldu";
        String DB11_PASS = "oldu";
        String DB11_SQL = "SELECT * from dbtest2.tabletest2";

        DbConnect dbConnect11 = new DbConnect(DB11_DRIVER, DB11_URL, DB11_USER, DB11_PASS);
        dbConnect11.executeQuery(DB11_SQL);
        dbConnect11.systemOutResultSetInfo();
        dbConnect11.systemOutResultSetContent();
        dbConnect11.close();

        // #################################################################################

        // mysql2
        String DB2_DRIVER = "com.mysql.jdbc.Driver";
        String DB2_URL = "jdbc:mysql://192.168.1.115";
        String DB2_USER = "oldu";
        String DB2_PASS = "oldu";
        String DB2_SQL = "SELECT * from dbtest.tabletest";

        DbConnect dbConnect2 = new DbConnect(DB2_DRIVER, DB2_URL, DB2_USER, DB2_PASS);
        dbConnect2.executeQuery(DB2_SQL);
        dbConnect2.systemOutResultSetInfo();
        dbConnect2.systemOutResultSetContent();
        dbConnect2.close();

        // #################################################################################

        // mysql2, 2ième DB
        String DB22_SQL = "SELECT * from dbtest2.tabletest2";

        dbConnect2.executeQuery(DB22_SQL);
        dbConnect2.systemOutResultSetInfo();
        dbConnect2.systemOutResultSetContent();
        dbConnect2.close();

        // #################################################################################

        // postgresql
        String DB3_DRIVER = "org.postgresql.Driver";
        String DB3_URL = "jdbc:postgresql://192.168.1.117/oldu";
        String DB3_USER = "oldu";
        String DB3_PASS = "oldu";
        //String DB3_SQL = "SELECT * FROM public.tabletest";
        String DB3_SQL = "SELECT * FROM tabletest";

        DbConnect dbConnect3 = new DbConnect(DB3_DRIVER, DB3_URL, DB3_USER, DB3_PASS);
        dbConnect3.executeQuery(DB3_SQL);
        dbConnect3.systemOutResultSetInfo();
        dbConnect3.systemOutResultSetContent();
        dbConnect3.close();

        // #################################################################################

        // mariadb1
        String DB4_DRIVER = "org.mariadb.jdbc.Driver";
        String DB4_URL = "jdbc:mariadb://192.168.1.118:3306";
        String DB4_USER = "oldu";
        String DB4_PASS = "oldu";
        String DB4_SQL = "SELECT * from dbtest.tabletest";

        DbConnect dbConnect4 = new DbConnect(DB4_DRIVER, DB4_URL, DB4_USER, DB4_PASS);
        dbConnect4.executeQuery(DB4_SQL);
        dbConnect4.systemOutResultSetInfo();
        dbConnect4.systemOutResultSetContent();
        dbConnect4.close();

        // #################################################################################

    }
}
