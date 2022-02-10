package com.example.spring.demo.basics.example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DataReader implements IReader {

    FileReader reader = null;
    StringBuilder builder =null;
    Scanner scanner = null;

    public  DataReader(String name) throws FileNotFoundException {
        scanner = new Scanner(new File(name));
        builder = new StringBuilder();
    }
    @Override
    public String read() {
        while (scanner.hasNext()){
            builder.append(scanner.next());
            builder.append("");
        }
        return builder.toString();
    }
}
