package tests;

import helpers.Login;
import helpers.SetupAndTeardown;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstTestWithMapAndHooks {

    private SetupAndTeardown setupAndTeardown = new SetupAndTeardown();
    private Login login = new Login();

    @Before
    public void setupTest() {
        setupAndTeardown.setup();
    }

    @Test
    public void newTest() {
        login.imgurLogin(setupAndTeardown.driver,"https://imgur.com/signin", "TestAccountJoey", "P@$$word");
    }

    @After
    public void teardownTest() {
        setupAndTeardown.teardown();
    }

}
