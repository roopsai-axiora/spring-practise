package in.roopsai.comment.service;

import in.roopsai.comment.model.Comment;
import in.roopsai.comment.proxy.CommentNotificationProxy;
import in.roopsai.comment.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentNotificationProxy emailCommentNotificationProxy;
    private final CommentNotificationProxy pushCommentNotificationProxy;
    private final CommentRepository commentRepository;

    public CommentService(@Qualifier("EMAIL") CommentNotificationProxy emailCommentNotificationProxy, @Qualifier("PUSH") CommentNotificationProxy pushCommentNotificationProxy, CommentRepository commentRepository) {
        this.emailCommentNotificationProxy = emailCommentNotificationProxy;
        this.pushCommentNotificationProxy = pushCommentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        emailCommentNotificationProxy.sendComment(comment);
        pushCommentNotificationProxy.sendComment(comment);
        System.out.println("Publishing comment" + comment);
    }
}
