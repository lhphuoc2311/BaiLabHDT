/*
*  created date: Oct 28, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAcessDemoProgram {
    public static void main(String[] args) {
        
        String databaseURL = "jdbc:ucanaccess://d://DEMO//2021//LapTrinhHDT//BaiLabHDT//Database1.accdb";

        try {
            Connection connection = DriverManager.getConnection(databaseURL);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //d://DEMO//2021//LapTrinhHDT//BaiLabHDT//Database1.accdb
    }
    
}
