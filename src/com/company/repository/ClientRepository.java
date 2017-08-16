package com.company.repository;

import com.company.model.Clients;
import com.company.model.Salesman;

import java.util.List;

/**
 * Created by pvmeira on 15/08/2017.
 */
public class ClientRepository extends AbstractRepository<Clients> {
    private static ClientRepository Instance = new ClientRepository();

    public ClientRepository() {

    }

    public static ClientRepository getInstance() {
        return Instance;
    }

    public List<Clients> getClients() {
        return getData();

    }

    public static void setInstance(ClientRepository instance) {
        Instance = instance;
    }
}
