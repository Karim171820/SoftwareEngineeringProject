/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

/**
 *
 * @author Kemiaa
 */
public abstract class  User {
   private  int id;
   private  int role;
   private String UserName;
   private String password;

    public void setId(int id) {
        this.id = id;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
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
        return UserName;
    }

    public String getPassword() {
        return password;
    }
   //       TO DO
   public  abstract void  createAccount();
//       TO DO
       public abstract void update();
//   TO DO
       public abstract void logIn();
    
}
