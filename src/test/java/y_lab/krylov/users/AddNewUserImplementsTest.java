package y_lab.krylov.users;

import org.assertj.db.type.Source;
import org.assertj.db.type.Table;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddNewUserImplementsTest {
    Table table;
    Source source;
    @BeforeEach
    void setUp(){
        source = new Source("jdbc:postgresql://localhost:333/postgres", "username", "password");
        table = new Table(source, "users");
    }

    @Test
    void addNewUser() {

    }
}