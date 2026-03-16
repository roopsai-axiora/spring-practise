package in.roopsai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "in.roopsai")
@EnableAspectJAutoProxy
public class ProjectConfig {

}
