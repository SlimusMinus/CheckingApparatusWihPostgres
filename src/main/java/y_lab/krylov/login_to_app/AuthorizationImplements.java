package y_lab.krylov.login_to_app;

import y_lab.krylov.database.GetConnection;
import y_lab.krylov.users.GetAllUsers;
import y_lab.krylov.users.GetAllUsersImplements;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AuthorizationImplements implements Authorization {
    private String login;
    private String password;
    private static int user_id;

    public static int getUser_id() {
        return user_id;
    }

    Scanner in = new Scanner(System.in);

    @Override
    public void input_data() {
        System.out.println("Input login");
        login = in.next();
        System.out.println("Input password");
        password = in.next();
    }

    @Override
    public boolean IsAuthorization() {
        input_data();
        GetAllUsers getAllUsers = new GetAllUsersImplements();
        try {
            ResultSet resultSet = getAllUsers.getAllUsers();
            while (resultSet.next()) {
                if (resultSet.getString("login").equals(login) && resultSet.getString("password").equals(password)) {
                    System.out.println("Welcome in app " + resultSet.getString("name"));
                    user_id = resultSet.getInt("id");
                    return true;
                }
            }
        } catch (SQLException exception) {
            exception.getMessage();
        }
        System.out.println("Data is incorrect");
        return false;
    }

}
