package in.roopsai.comment.service;

import in.roopsai.comment.model.Comment;
import in.roopsai.comment.proxy.CommentNotificationProxy;
import in.roopsai.comment.repository.CommentRepository;

public class CommentService {

    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;

    public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment) {
        System.out.println("Publishing comment" + comment);
    }
}
