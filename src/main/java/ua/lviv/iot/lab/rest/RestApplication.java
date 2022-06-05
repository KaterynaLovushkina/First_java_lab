package ua.lviv.iot.lab.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({
                "ua.lviv.iot.lab.dataaccess",
                "ua.lviv.iot.lab.business",
                "ua.lviv.iot.lab.controller",
                "ua.lviv.iot.lab.rest"})
@EnableJpaRepositories({"ua.lviv.iot.lab.dataaccess"})
public class RestApplication {

    public static void main(String[] args) {

        SpringApplication.run(RestApplication.class, args);
        }



}
