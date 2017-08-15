package com.company.repository;

import com.company.model.Clients;
import com.company.model.Salesman;

import java.util.List;

/**
 * Created by pvmeira on 15/08/2017.
 */
public class ClientRepository extends AbstractRepository<Clients> {
    private static final ClientRepository Instance = new ClientRepository();

    private ClientRepository() {

    }

    public static ClientRepository getInstance() {
        return Instance;
    }

    public List<Clients> getClients() {
        return getData();

    }

    public long clientsQuantity() {
        return getData().stream().distinct().count();
    }

}
