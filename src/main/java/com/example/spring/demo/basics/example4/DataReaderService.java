package com.example.spring.demo.basics.example4;

import com.example.spring.demo.basics.example2.IReader;

import java.io.FileNotFoundException;

public class DataReaderService {
    IReader reader = null;

    public  DataReaderService(IReader reader){
        this.reader = reader;
    }

    public void fetchData() throws FileNotFoundException {
        System.out.println(" reader.read()......"+ reader.read());
    }


}
