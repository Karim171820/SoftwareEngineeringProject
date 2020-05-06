package recruitmentsystem;

public class SystemAdministrator extends User {

    private static SystemAdministrator Admin = null;

    private SystemAdministrator() {
    }

    public static SystemAdministrator getInstance() {

        if (Admin == null) {
            Admin = new SystemAdministrator();
            return Admin;
        } else
            return Admin;
    }

    public String RemoveVac(int JobID) {

        // Access the Database and get the job with this job id and remove it form the
        // database

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

    @Override
    public void createAccount() {

    }

    @Override
    public void update() {

    }

    @Override
    public void logIn() {

    }

}