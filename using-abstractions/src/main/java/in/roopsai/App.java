package in.roopsai;

import in.roopsai.comment.model.Comment;
import in.roopsai.comment.proxy.CommentNotificationProxy;
import in.roopsai.comment.proxy.EmailCommentNotificationProxy;
import in.roopsai.comment.repository.CommentRepository;
import in.roopsai.comment.repository.DBCommentRepository;
import in.roopsai.comment.service.CommentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var commentRepo = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var comment = new Comment("Roop Sai", "Hello");
        var commentService = new CommentService(commentNotificationProxy, commentRepo);
        commentService.publishComment(comment);

    }
}
