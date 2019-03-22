/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enri.db;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ib.enrique
 */
public class MyConnection implements Serializable{
    
    public static Connection openConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433; databasename=StudentDB; user =sa; password =123456789");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
