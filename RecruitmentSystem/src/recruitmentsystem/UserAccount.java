/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

import java.sql.Connection;
import java.sql.Statement;


/**
 *
 * @author Kemiaa
 */
public abstract class  UserAccount {
   private  int id;
   private  int role;
   private String userName;
   private String password;

   
   UserAccount(int role,String username,String password){
      this.createAccount(role, username, password);
   }
   
   
    public void setId(int id) {
        this.id = id;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setUserName(String UserName) {
        this.userName = UserName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public int getRole() {
        return role;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
   //       TO DO
   public  void  createAccount(int role, String username, String password){
       
//       add in the Table User
       
       try {
            Statement stmt = RecruitmentSystem.con.createStatement();
            stmt.executeUpdate("insert into useraccount (Role, password, username) values('" + role + "', '" + password+  "', '" + username + "')");
            System.out.println("User added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
   
//       Add in the Table Based on the role !
       switch(role) {
           case 1:
            
//       try {
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("insert into students values('" + s.getName() + "', " + s.getGPA() + ")");
//            System.out.println("Student added");
//        } catch (Exception e) {
//            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
//        }
 
               break;
           case 2:
                         /*
       try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into students values('" + s.getName() + "', " + s.getGPA() + ")");
            System.out.println("Student added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
*/
            break;
            
           case 3:
                         /*
       try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into students values('" + s.getName() + "', " + s.getGPA() + ")");
            System.out.println("Student added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
*/
               break;
              
       
       
       }  
       
   }
   
//       TO DO
       public abstract void update();
//   TO DO
       public abstract void logIn();
    
}
