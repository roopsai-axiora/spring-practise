package in.roopsai.service;

import in.roopsai.model.Comment;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.beans.BeanProperty;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    private int spamWordCount = 0;
    private List<String> foundSpamWords = new ArrayList<>();
    private static final List<String> SPAM_WORDS = List.of(
            "buy now",
            "click here",
            "free money",
            "winner"
    );

    public boolean process(Comment comment) {
        spamWordCount = 0;
        foundSpamWords = new ArrayList<>();
        String content = comment.getContent();
        for(String spamWord : SPAM_WORDS){
            if(content.contains(spamWord)){
                spamWordCount++;
                foundSpamWords.add(spamWord);
            }
        }

        System.out.println("Processing comment by: " + comment.getAuthor());
        System.out.println("  Spam words found: " + foundSpamWords);

        return spamWordCount > 0;
    }

    public int getSpamWordCount() {
        return spamWordCount;
    }

    public List<String> getFoundSpamWords(){
        return foundSpamWords;
    }
    public CommentProcessor() {
        System.out.println("Creating comment processor");
    }
}
