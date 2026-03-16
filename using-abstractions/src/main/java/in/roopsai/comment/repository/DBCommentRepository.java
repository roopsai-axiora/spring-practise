package in.roopsai.comment.repository;

import in.roopsai.comment.model.Comment;

public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment in database: " +  comment);
    }
}
