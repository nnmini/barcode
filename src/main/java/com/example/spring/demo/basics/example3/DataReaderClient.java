package com.example.spring.demo.basics.example3;

import com.example.spring.demo.basics.example2.IReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class DataReaderClient {
    static String  fileName = "src\\main\\resources\\data\\basic-trade.txt";
    ApplicationContext context = null;
    public void fetchData() throws FileNotFoundException {
        context = new ClassPathXmlApplicationContext("data-reader.xml");
        IReader reader= (IReader)context.getBean("reader");
        System.out.println(" reader.read()......"+ reader.read());
    }
    public static void main(String[] args) throws FileNotFoundException {
        com.example.spring.demo.basics.example2.DataReaderClient client = new com.example.spring.demo.basics.example2.DataReaderClient();
        client.fetchData();

    }
}
