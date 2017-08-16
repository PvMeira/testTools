package com.company.core;

import com.company.model.Clients;
import com.company.model.Sales;
import com.company.model.Salesman;
import com.company.repository.ClientRepository;
import com.company.repository.SalesRepository;
import com.company.repository.SalesmanRepository;

import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by pvmeira on 15/08/2017.
 */
public class Service {

    public void saveSales(String id, Scanner scanner) {
        Sales sales = new Sales(Long.valueOf(id), scanner.nextLong(), scanner.nextLong(),
                scanner.nextInt(), Double.valueOf(scanner.next()), scanner.next());
        sales.setTotalValue(sales.getPrice() * sales.getQuantity());
        SalesRepository.getInstance().add(sales);

    }


    public void saveClients(String id, Scanner scanner) {
        Clients clients = new Clients(Long.valueOf(id), scanner.next(), scanner.next(), scanner.next());
        ClientRepository.getInstance().add(clients);
    }


    public void saveSalesman(String id, Scanner scanner) {
        Salesman salesman = new Salesman(Long.valueOf(id), scanner.next(), scanner.next(), Double.valueOf(scanner.next()));
        SalesmanRepository.getInstance().add(salesman);
    }

    public void cleanRepositories() {
        SalesRepository.setInstance(new SalesRepository());
        SalesmanRepository.setInstance(new SalesmanRepository());
        ClientRepository.setInstance(new ClientRepository());
    }


    //Result methods
    public Long getMostExpensiveSale() {
        return SalesRepository.getInstance().getSale().stream().max(Comparator.comparing(Sales::getTotalValue)).get().getIdSale();
    }

    public String getWorstSalesman() {
        return SalesRepository.getInstance().getSale().stream().min(Comparator.comparing(Sales::getTotalValue)).get().getSalesmanName();
    }

    public Long amountOfClients() {
        return ClientRepository.getInstance().getClients().stream().count();
    }

    public Long amountOfSalesman() {
        return SalesmanRepository.getInstance().getSalesman().stream().count();
    }
}
