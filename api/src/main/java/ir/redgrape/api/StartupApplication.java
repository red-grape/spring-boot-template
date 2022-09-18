package ir.redgrape.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"ir.redgrape.service",
        "ir.redgrape.api",
        "ir.redgrape.repo"})
@EnableJpaRepositories(basePackages = "ir.redgrape.repo")
@EntityScan(basePackages = "ir.redgrape.model.entities")
public class StartupApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartupApplication.class,args);
    }
}
