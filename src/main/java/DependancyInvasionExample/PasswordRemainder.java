package DependancyInvasionExample;

public class PasswordRemainder {
    private DbConnectionInterface dbConnection;
    public  PasswordRemainder(DbConnectionInterface dbConnection){
        this.dbConnection = dbConnection;
    }
}
