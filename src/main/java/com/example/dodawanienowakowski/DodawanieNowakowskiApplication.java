package com.example.dodawanienowakowski;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DodawanieNowakowskiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DodawanieNowakowskiApplication.class, args);
    }

    public int added(int a,int b){
        return a*b;
    }

}
