package com.company.model;

/**
 * Created by pvmeira on 15/08/2017.
 */
public class Clients extends Entity {

    private String cnpj;

    private String name;

    private String sector;

    public Clients(Long id, String cnpj, String name, String sector) {
        super(id);
        this.cnpj = cnpj;
        this.name = name;
        this.sector = sector;
    }

    public Clients(String cnpj, String name, String sector) {
        this.cnpj = cnpj;
        this.name = name;
        this.sector = sector;
    }

    public Clients() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
