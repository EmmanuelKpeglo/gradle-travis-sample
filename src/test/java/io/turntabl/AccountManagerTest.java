package io.turntabl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountManagerTest {

    AccountManager accountManager;

    @Before
    public void setUp() throws Exception {
        accountManager = new AccountManager("Nimo");
    }

    @Test
    public void getName() {
        String name = accountManager.getName();
        assertEquals("Nimo", name);
    }
}