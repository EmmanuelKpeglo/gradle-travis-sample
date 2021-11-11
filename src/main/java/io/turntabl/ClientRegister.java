package io.turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ClientRegister {
    private List<Client> clientList = new ArrayList<>();

    public ClientRegister(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<String> contactNamesOf_N_ServiceLevelClients (ServiceLevel serviceLevel) {
        return clientList.stream()
                .filter(client -> client.getServiceLevel().equals(serviceLevel))
                .map(Client::getContactPerson)
                .collect(Collectors.toList());
    }

    public String getClientNameById (String id) {
        return clientList.stream().
                filter(client -> client.getID().equals(id))
                .map(Client::getName).findFirst()
                .map(Object::toString).orElse("No client exists with that ID");
    }

    public Map<String, Long> countOfClientsAtEveryServiceLevel () {
        return clientList.stream()
                .collect(Collectors.groupingBy(client -> client.getServiceLevel().toString(), Collectors.counting()));
    }

    public void addClient(Client client) {
        clientList.add(client);
    }

    public void removeClient(Client client) {
        clientList.remove(client);
    }
}


