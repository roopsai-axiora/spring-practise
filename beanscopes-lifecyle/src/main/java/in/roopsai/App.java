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

        var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = ctx.getBean(CommentService.class);
        Comment commentA = new Comment("User A", "This is a comment");
        Comment commentB = new Comment("User B", "buy now and get free money");
        Comment commentC = new Comment("User C", "Very helpful, thank you!");
        service.publishComment(commentA);
        service.publishComment(commentB);
        service.publishComment(commentC);

    }
}
