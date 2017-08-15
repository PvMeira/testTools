package com.company.repository;

import com.company.model.Sales;
import com.company.model.Salesman;

import java.util.List;

/**
 * Created by pvmeira on 15/08/2017.
 */
public class SalesRepository extends AbstractRepository<Sales> {

    private static final SalesRepository Instance = new SalesRepository();


    private SalesRepository() {

    }

    public static SalesRepository getInstance() {
        return Instance;
    }

    public List<Sales> getSalesman() {
        return getData();

    }

    public long salesmanQuantity() {
        return getData().stream().distinct().count();
    }


}
