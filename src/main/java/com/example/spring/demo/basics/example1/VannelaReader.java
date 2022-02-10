package com.example.spring.demo.basics.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class VannelaReader {
    FileReader reader = null;
    StringBuilder builder =null;
    Scanner scanner = null;

    public VannelaReader(String fileName) throws FileNotFoundException {
         scanner = new Scanner(new File(fileName));
        builder = new StringBuilder();
    }

    public  String read(){
        while (scanner.hasNext()){
            builder.append(scanner.next());
            builder.append("");
        }
        return builder.toString();
    }

}
