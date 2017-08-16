package com.company.core;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by pvmeira on 15/08/2017.
 */
public class CustomFileWriter {
    private static final String LOCAL_OUTPUT = "dados/out/";

    public void FileWriter(String fileName) throws IOException {
        Files.write(new File(LOCAL_OUTPUT + fileName + ".proc").toPath(), createFileContent().toString().getBytes());

    }

    public StringBuilder createFileContent() {
        Service service = new Service();
        StringBuilder finalBuilder = new StringBuilder();
        return finalBuilder
                .append(String.format("Quantidade de Clientes: %s \n", service.amountOfClients()))
                .append(String.format("Quantidade de Vendedores: %s \n", service.amountOfSalesman()))
                .append(String.format("ID da Venda de valor mais alto: %s \n", service.getMostExpensiveSale()))
                .append(String.format("Nome do Vendedor que menos vendeu: %s \n", service.getWorstSalesman()));
    }
}
