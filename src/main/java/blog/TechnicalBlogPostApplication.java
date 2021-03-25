package blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TechnicalBlogPostApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechnicalBlogPostApplication.class,args);
    }
}
