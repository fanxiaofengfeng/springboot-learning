package live.anli;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootLearningApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext run = SpringApplication.run(SpringbootLearningApplication.class, args);
         SpringApplication app = new SpringApplication(SpringbootLearningApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

    }

}
