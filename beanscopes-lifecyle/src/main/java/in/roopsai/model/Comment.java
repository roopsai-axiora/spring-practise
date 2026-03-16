package in.roopsai.model;

public class Comment {

    private String author;
    private String content;

    public Comment(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
