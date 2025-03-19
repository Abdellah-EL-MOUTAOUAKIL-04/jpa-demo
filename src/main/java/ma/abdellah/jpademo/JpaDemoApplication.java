package ma.abdellah.jpademo;

import ma.abdellah.jpademo.entities.User;
import ma.abdellah.jpademo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserService userService) {
        return args -> {
            User u1=new User();
            u1.setUsername("abdellah");
            u1.setPassword("1234");
            userService.addNewUser(u1);
        };
    }
}
