package ir.redgrape.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"ir.redgrape.service","ir.redgrape.api"})
public class StartupApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartupApplication.class,args);
    }
}
