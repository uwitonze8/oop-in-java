package Revisional_questions.librarysystem;

public class book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    public book(int id, String title, String author, boolean isIssued) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = isIssued;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isIssued() { return isIssued; }

    @Override
    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Author: " + author + " | Issued: " + (isIssued ? "Yes" : "No");
    }
}
