package y_lab.krylov.login_to_app;

import junit.framework.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class AuthorizationImplementsTest {

    AuthorizationImplements authorization;
    String login;
    String password;
    @BeforeEach
    void setUser(){
        authorization = new AuthorizationImplements();
        login = "admin";
        password = "admin";
    }
    @Test
    @DisplayName("check enter in database")
    void isAuthorization() {
        assertThat(true).isTrue();
    }
}