package com.company;

import com.company.core.CustomFileWriter;
import com.company.core.InformationReader;
import com.company.core.Service;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        InformationReader informationReader = new InformationReader();
        CustomFileWriter customFileWriter = new CustomFileWriter();
        Service service = new Service();
        try {
            DirectoryStream<Path> paths = Files.newDirectoryStream(Paths.get("dados/in/"),
                    path -> path.toString().endsWith(".dat"));
            for (Path p : paths) {
                informationReader.readFiles(p.getFileName().toString());
                customFileWriter.FileWriter(p.getFileName().toString());
                service.cleanRepositories();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
