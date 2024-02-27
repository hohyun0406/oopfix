package model;

public class BoardDto {
    private int id;
    private String subject;
    private String content;
    private String writer;

    public BoardDto(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

}
