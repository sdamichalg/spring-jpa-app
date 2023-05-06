package pl.sda.micgeb.springjpaapp;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.micgeb.springjpaapp.service.InitService;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringJpaAppApplication implements CommandLineRunner {

    private final InitService initService;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        initService.createSimpleData();
    }
}
