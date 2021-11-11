package io.turntabl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    Client corporateClient;
    Client privateClient;
    AccountManager accountManager;

    @Before
    public void setUp() throws Exception {
        accountManager = new AccountManager("Mario");
        corporateClient = new CorporateClient("Luigi", "LM", ServiceLevel.Platinum, accountManager);
        privateClient = new PrivateClient("Yoshi", "YM", ServiceLevel.Premium);
    }

    @Test
    public void getName() {
        String ccName = corporateClient.getName();
        String pcName = privateClient.getName();
        assertEquals("Luigi", ccName);
        assertEquals("Yoshi", pcName);
    }

    @Test
    public void setName() {
        corporateClient.setName("Jessy");
        privateClient.setName("Pinkman");
        String ccName = corporateClient.getName();
        String pcName = privateClient.getName();
        assertEquals("Jessy", ccName);
        assertEquals("Pinkman", pcName);
    }

    @Test
    public void getID() {
        String ccID = corporateClient.getID();
        String pcID = privateClient.getID();
        assertEquals("LM", ccID);
        assertEquals("YM", pcID);
    }

    @Test
    public void setID() {
        corporateClient.setID("NLM");
        privateClient.setID("NYM");
        String ccID = corporateClient.getID();
        String pcID = privateClient.getID();
        assertEquals("NLM", ccID);
        assertEquals("NYM", pcID);
    }

    @Test
    public void getServiceLevel() {
        String ccSL = corporateClient.getServiceLevel().toString();
        String pcSL = privateClient.getServiceLevel().toString();
        assertEquals("Platinum", ccSL);
        assertEquals("Premium", pcSL);
    }

    @Test
    public void setServiceLevel() {
        corporateClient.setServiceLevel(ServiceLevel.Gold);
        privateClient.setServiceLevel(ServiceLevel.Platinum);
        String ccSL = corporateClient.getServiceLevel().toString();
        String pcSL = privateClient.getServiceLevel().toString();
        assertEquals("Gold", ccSL);
        assertEquals("Platinum", pcSL);
    }
}