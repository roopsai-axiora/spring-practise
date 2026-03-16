package in.roopsai.comment.proxy;

import in.roopsai.comment.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending email notification for comment" + comment);
    }
}
