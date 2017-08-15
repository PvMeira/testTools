package com.company;

import com.company.model.Clients;
import com.company.model.Sales;
import com.company.model.Salesman;
import com.company.repository.ClientRepository;
import com.company.repository.SalesRepository;
import com.company.repository.SalesmanRepository;

import java.io.FileReader;
import java.util.Scanner;

public class Main {
    private static final String PATH_VARIABLE = "dados/%s/%s";

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new FileReader(String.format(PATH_VARIABLE, "in", "file01.dat")));
            scanner.useDelimiter(";|\\n|\\r");

            while (scanner.hasNext()) {
                String id = scanner.next();
                switch (id) {
                    case "001":
                        SalesmanRepository.getInstance().add(
                                new Salesman(Long.valueOf(id), scanner.next(), scanner.next(), scanner.nextDouble()));
                        break;

                    case "002":
                        ClientRepository.getInstance().add(
                                new Clients(Long.valueOf(id), scanner.next(), scanner.next(), scanner.next()));
                        break;

                    case "003":
                        SalesRepository.getInstance().add(
                                new Sales(Long.valueOf(id), scanner.nextLong(), scanner.nextLong(),
                                        scanner.nextInt(), scanner.nextDouble(), scanner.next()));
                        break;

                    default:
                        System.out.println("Non");
                        break;

                }
                ClientRepository clientRepository = ClientRepository.getInstance();
                long count = clientRepository.getClients().stream().count();
                System.out.println(count);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void fillOutFile() {
//        FileWriter fileWriter = new FileWriter();

    }

    private static void fillSale() {

    }

    private static void fillClients() {

    }

    private static void fillSalesman() {

    }
}
