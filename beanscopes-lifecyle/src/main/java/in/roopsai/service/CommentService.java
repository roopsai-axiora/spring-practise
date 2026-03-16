package in.roopsai.service;

import in.roopsai.model.Comment;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final ApplicationContext applicationContext;

    public CommentService(CommentRepository commentRepository, ApplicationContext applicationContext) {
        this.commentRepository = commentRepository;
        this.applicationContext = applicationContext;
    }

    public void publishComment(Comment comment){
        System.out.println("Publishing comment by author:"+comment.getAuthor());
        CommentProcessor commentProcessor = applicationContext.getBean(CommentProcessor.class);
        boolean isSpam = commentProcessor.process(comment);
        if (isSpam){
            System.out.println("SPAM detected!" + " Not saving! Spam Words: " + commentProcessor.getFoundSpamWords());
            return;
        }

        System.out.println("Comment is clean. Saving to DB");
        commentRepository.save(comment);
    }
}
