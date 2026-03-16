package in.roopsai.service;

import in.roopsai.model.Comment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CommentRepository {

    private List<Comment> storage = new ArrayList<>();

    public void save(Comment comment){
        storage.add(comment);
        System.out.println("Saving comment to DB: " + comment);
    }

    public List<Comment> getComments(){
        return storage;
    }
}
