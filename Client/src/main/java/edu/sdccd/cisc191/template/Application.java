package edu.sdccd.cisc191.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    //launch spring application postgresql database
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
