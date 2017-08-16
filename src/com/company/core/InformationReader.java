package com.company.core;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by pvmeira on 15/08/2017.
 */
public class InformationReader {
    private static final String PATH_VARIABLE = "dados/in/%s";

    public void readFiles(String path) {
        Service service = new Service();


        try

        {
            Scanner scanner = new Scanner(new FileReader(String.format(PATH_VARIABLE, path)));
            scanner.useDelimiter(";|\\n|\\r");

            while (scanner.hasNext()) {
                String id = scanner.next();
                switch (id) {
                    case "001":
                        service.saveSalesman(id, scanner);
                        break;

                    case "002":
                        service.saveClients(id, scanner);
                        break;

                    case "003":
                        service.saveSales(id, scanner);
                        break;

                    default:
                        break;

                }
            }
        } catch (Exception e) {
            System.err.println(String.format("Erro ao ler arquivos, erro  : %s", e.getMessage()));
        }
    }
}
