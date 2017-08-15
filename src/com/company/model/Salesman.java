package com.company.model;

/**
 * Created by pvmeira on 15/08/2017.
 */
public class Salesman extends Entity {

    private String cpf;

    private String name;

    private Double salary;

    public Salesman(Long id, String cpf, String name, Double salary) {
        super(id);
        this.cpf = cpf;
        this.name = name;
        this.salary = salary;
    }

    public Salesman(String cpf, String name, Double salary) {
        this.cpf = cpf;
        this.name = name;
        this.salary = salary;
    }

    public Salesman() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
