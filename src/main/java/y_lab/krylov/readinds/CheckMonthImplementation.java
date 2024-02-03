package y_lab.krylov.readinds;

import y_lab.krylov.users.GetAllUsers;
import y_lab.krylov.users.GetAllUsersImplements;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CheckMonthImplementation implements CheckMonth{
    @Override
    public boolean checkMonth(int month, int year) {
        AllReadings allReadings = new AllReadingsImplements();
        try {
            ResultSet resultSet = allReadings.getAllReadings();
            while (resultSet.next()) {
                System.out.println(resultSet.getString(3));
                LocalDate dt = LocalDate.parse(resultSet.getString(3));

                if (dt.getMonth().getValue() == month && dt.getYear() == year)
                    return true;
            }
        } catch (SQLException exception) {
            exception.getMessage();
        }
        return false;
    }
}
