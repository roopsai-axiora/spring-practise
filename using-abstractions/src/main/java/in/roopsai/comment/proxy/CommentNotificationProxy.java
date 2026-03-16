package in.roopsai.comment.proxy;

import in.roopsai.comment.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
