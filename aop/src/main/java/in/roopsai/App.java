package in.roopsai;

import in.roopsai.config.ProjectConfig;
import in.roopsai.model.Comment;
import in.roopsai.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = ctx.getBean(CommentService.class);
        var comment = new Comment("Roop Sai", "This is a comment");
        service.publishComment(comment);
    }
}
