package io.turntabl;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ClientRegisterTest {
    ClientRegister clientRegister;

    @Before
    public void setUp() throws Exception {
        clientRegister = new ClientRegister(Arrays.asList(
                new PrivateClient("luigi", "lm", ServiceLevel.Gold),
                new CorporateClient("yoshi", "ym", ServiceLevel.Platinum, new AccountManager("Mario")),
                new PrivateClient("max", "mw", ServiceLevel.Premium),
                new CorporateClient("diane", "dd", ServiceLevel.Gold, new AccountManager("lizzy"))
        ));
    }

    @Test
    public void contactNamesOf_N_ServiceLevelClients() {
        List<String> contactNamesOfAllGoldClients = clientRegister.contactNamesOf_N_ServiceLevelClients(ServiceLevel.Gold);
        assertEquals(Arrays.asList("luigi", "lizzy"), contactNamesOfAllGoldClients);
    }

    @Test
    public void getClientNameById() {
        String clientName = clientRegister.getClientNameById("lm");
        assertEquals("luigi", clientName);
    }

    @Test
    public void countOfClientsAtEveryServiceLevel() {
        Map<String, Long> countOfClients = clientRegister.countOfClientsAtEveryServiceLevel();
        assertTrue(countOfClients.get("Gold") == 2);
    }
}