/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner; 

/**
 *
 * @author Kemiaa
 */
public class RecruitmentSystem {

    /**
     * @param args the command line arguments
     */
    public static Connection con;

    public static void main(String[] args) {
        // TODO code application logic here

        try {
            //Loading the jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            //Get a connection to database
            
//            Connection of database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "recruitment_system", "root", "");
           
            
            JobSeeker j = new JobSeeker(2, "Abdelrahaman4", "Kodsy4", "Adnan4", 20, "karim@gmail.com", "BUE");
            
//            j.apply( 1, 1,"1/1/2020", "yes");
            
        } catch (Exception e) {
            System.err.println("DATABASE CONNECTION ERROR: " + e.toString());

        }

    }
}
