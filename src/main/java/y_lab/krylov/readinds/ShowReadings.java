package y_lab.krylov.readinds;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ShowReadings {
    public void printActualReadings(ResultSet resultSet);
}
