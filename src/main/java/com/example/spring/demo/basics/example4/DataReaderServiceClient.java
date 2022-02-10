package com.example.spring.demo.basics.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class DataReaderServiceClient {
    ApplicationContext context = null;
    DataReaderService dataReaderService=null;

    DataReaderServiceClient(){
        context = new ClassPathXmlApplicationContext("data-reader.xml");
        dataReaderService = (DataReaderService) context.getBean("readerService");
    }
    public void fetchData() throws FileNotFoundException {
        dataReaderService.fetchData();
    }

}
