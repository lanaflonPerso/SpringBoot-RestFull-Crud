package mc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = {"mc.persistence"})
@EntityScan(basePackages = {"mc.entity"})
@ComponentScan(basePackages = {"mc.persistence", "mc.entity", "mc.web"})
public class StartApp {

    public static void main(String[] args){
        SpringApplication.run(StartApp.class);
    }
}
