package com.company.repository;

import com.company.model.Salesman;

import java.util.List;

public class SalesmanRepository extends AbstractRepository<Salesman> {

    private static SalesmanRepository Instance = new SalesmanRepository();


    public SalesmanRepository() {

    }

    public static SalesmanRepository getInstance() {
        return Instance;
    }

    public List<Salesman> getSalesman() {
        return getData();

    }

    public static void setInstance(SalesmanRepository instance) {
        Instance = instance;
    }
}