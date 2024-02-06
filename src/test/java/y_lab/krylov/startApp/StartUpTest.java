package y_lab.krylov.startApp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.assertj.db.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


class StartUpTest {
    @BeforeAll
    static void setUp() {
        StartUp.choice = 1;
    }

    @Test
    @DisplayName("checking input value")
    void getChoice() {
        Assertions.assertThat(StartUp.choice).isEqualTo(1);
    }
}
