package com.example.spring.demo.basics.example2;

import java.io.FileNotFoundException;

public class DataReaderClient {
    static String  fileName = "src\\main\\resources\\data\\basic-trade.txt";

    public void fetchData() throws FileNotFoundException {
        IReader reader= new DataReader(fileName);
        System.out.println(" reader.read()......"+ reader.read());
    }
    public static void main(String[] args) throws FileNotFoundException {
        DataReaderClient client = new DataReaderClient();
        client.fetchData();

    }
}
