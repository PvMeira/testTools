package com.company.repository;

import com.company.model.Sales;
import com.company.model.Salesman;

import java.util.List;

/**
 * Created by pvmeira on 15/08/2017.
 */
public class SalesRepository extends AbstractRepository<Sales> {

    private static SalesRepository Instance = new SalesRepository();


    public SalesRepository() {

    }

    public static SalesRepository getInstance() {
        return Instance;
    }

    public List<Sales> getSale() {
        return getData();

    }

    public static void setInstance(SalesRepository instance) {
        Instance = instance;
    }
}
