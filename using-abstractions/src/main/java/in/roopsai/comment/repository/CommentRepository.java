package in.roopsai.comment.repository;

import in.roopsai.comment.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
