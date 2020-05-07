package recruitmentsystem;

public class SystemAdministrator extends UserAccount {

    private static SystemAdministrator Admin = null;


    public SystemAdministrator(int role, String username, String password) {
        super(role, username, password);
    }

    
    public static SystemAdministrator getInstance() {

        if (Admin == null) {
            Admin = new SystemAdministrator(1,"admin","admin");
            return Admin;
        } else
            return Admin;
    }


    public String RemoveVac(int JobID) {

        JobAdmin Remove = new JobAdmin();
        Remove.RemoveVac(JobID);

        return null;
    }

    private Void SuspendUser(int USERID) {

        // Access the Database and deletes the user with the following id form the
        // database

        return null;

    }

    private String ConfirmVac(int jobID) {

        // confrims all the vaccancies befor posting

        return null;

    }

    public void createAccount() {

    }

    @Override
    public void update() {

    }

    @Override
    public void logIn() {

    }

}