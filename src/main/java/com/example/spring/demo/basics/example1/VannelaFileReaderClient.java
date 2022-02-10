package com.example.spring.demo.basics.example1;

import java.io.FileNotFoundException;

public class VannelaFileReaderClient {
    String fileName = "src\\main\\resources\\data\\basic-trade.txt";
    VannelaReader reader = null;

    public String fetchData() throws FileNotFoundException {
       return reader.read();

    }
    public  VannelaFileReaderClient() throws FileNotFoundException {
        reader = new VannelaReader(fileName);
    }

    public static void main(String[] args)  throws FileNotFoundException{
        VannelaFileReaderClient client  = new VannelaFileReaderClient();
        System.out.println(client.fetchData());

    }
}
