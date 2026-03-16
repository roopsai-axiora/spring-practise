package in.roopsai;

import in.roopsai.comment.model.Comment;
import in.roopsai.comment.proxy.CommentNotificationProxy;
import in.roopsai.comment.proxy.EmailCommentNotificationProxy;
import in.roopsai.comment.repository.CommentRepository;
import in.roopsai.comment.repository.DBCommentRepository;
import in.roopsai.comment.service.CommentService;
import in.roopsai.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        var comment = new Comment("Roop Sai", "Hello");

        var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService = (CommentService) ctx.getBean("commentService");
        commentService.publishComment(comment);

    }
}
