package com.ss.openapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class OrderApplicationMain {

    @Autowired
    private static OrderService os;
    public static void main(String[] argsg){
        SpringApplication.run(OrderApplicationMain.class, argsg);
        System.out.println (os);
    }



    public void test() throws Exception {
        os.orderGet();
    }

}
