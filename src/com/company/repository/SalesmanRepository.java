package com.company.repository;

import com.company.model.Salesman;

import java.util.List;

public class SalesmanRepository extends AbstractRepository<Salesman> {

    private static final SalesmanRepository Instance = new SalesmanRepository();


    private SalesmanRepository() {

    }

    public static SalesmanRepository getInstance() {
        return Instance;
    }

    public List<Salesman> getSalesman() {
        return getData();

    }

    public long salesmanQuantity() {
        return getData().stream().distinct().count();
    }


}