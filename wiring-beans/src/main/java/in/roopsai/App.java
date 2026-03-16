package in.roopsai;

import in.roopsai.config.AppConfig;
import in.roopsai.driver.Driver;
import in.roopsai.person.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        var john = ctx.getBean("john", Driver.class); // linking beans by directly calling methods that create them
        System.out.println(john.getCar());

        var doe = ctx.getBean("doe", Driver.class);
        System.out.println(doe.getCar()); // auto-wiring beans where we enable Spring to provide the value via method parameter.

        var person = ctx.getBean(Person.class);
        System.out.println(person.getParrot());
    }
}
