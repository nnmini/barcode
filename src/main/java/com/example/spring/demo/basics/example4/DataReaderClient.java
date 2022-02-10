package com.example.spring.demo.basics.example4;

import java.io.FileNotFoundException;

public class DataReaderClient {


    public static void main(String[] args) throws FileNotFoundException {
    DataReaderServiceClient client = new DataReaderServiceClient();
    client.fetchData();

    }
}
