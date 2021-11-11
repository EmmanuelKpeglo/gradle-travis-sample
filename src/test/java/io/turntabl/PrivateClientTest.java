package io.turntabl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrivateClientTest {
    Client privateClient;

    @Before
    public void setUp() throws Exception {
        privateClient = new PrivateClient("Mike Ehrmantraut", "ME", ServiceLevel.Platinum);
    }

    @Test
    public void getContactPerson() {
        String name = privateClient.getContactPerson();
        assertEquals("Mike Ehrmantraut", name);
    }
}