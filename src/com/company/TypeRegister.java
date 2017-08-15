package com.company;

/**
 * Created by pvmeira on 15/08/2017.
 */
public enum TypeRegister {
    CLIENT("001"),
    SALES("002"),
    SALESMAN("003");

    private String id;

    TypeRegister(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
