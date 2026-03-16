package in.roopsai;

import in.roopsai.config.Config;
import in.roopsai.user.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Config.class);

        var user = context.getBean(User.class);
        System.out.println(user.getCar());


    }
}
