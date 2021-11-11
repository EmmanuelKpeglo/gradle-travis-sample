package io.turntabl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CorporateClientTest {
    Client corporateClient;
    AccountManager accountManager;

    @Before
    public void setUp() throws Exception {
        accountManager = new AccountManager("Nacho");
        corporateClient = new CorporateClient("Tuco Salamanca", "TS", ServiceLevel.Gold, accountManager);
        accountManager.setName("Lalo");
    }

    @Test
    public void getContactPerson() {
        String name = corporateClient.getContactPerson();
        assertEquals("Lalo", name);
    }
}