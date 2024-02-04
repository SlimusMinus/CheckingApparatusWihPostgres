package y_lab.krylov.startApp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.db.api.Assertions.assertThat;


class StartUpTest {
    StartUp startUp = new StartUp();

    @BeforeEach
    void setUp(){
        final int choice =StartUp.getChoice();
    }
    @Test
    void getChoice() {

    }
}