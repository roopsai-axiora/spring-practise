package in.roopsai.comment.proxy;

import in.roopsai.comment.model.Comment;
import in.roopsai.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class PushCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment" + comment);
    }
}
