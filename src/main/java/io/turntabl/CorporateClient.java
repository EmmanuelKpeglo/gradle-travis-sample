package io.turntabl;

public class CorporateClient extends Client{

    private AccountManager accountManager;

    public CorporateClient(String name, String ID, ServiceLevel serviceLevel, AccountManager accountManager) {
        super(name, ID, serviceLevel);
        this.accountManager = accountManager;
    }

    @Override
    public String getContactPerson() {
        return accountManager.getName();
    }

}
