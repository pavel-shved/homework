package lesson7.home;

import java.util.Objects;

public class Book {
    private String name;
    private String authorName;
    private String authorSurName;
    private String authorPatronymic;

    public Book(){}

    public Book(String name, String authorName, String authorSurName, String authorPatronymic) {
        this.name = name;
        this.authorName = authorName;
        this.authorSurName = authorSurName;
        this.authorPatronymic = authorPatronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurName() {
        return authorSurName;
    }

    public void setAuthorSurName(String authorSurName) {
        this.authorSurName = authorSurName;
    }

    public String getAuthorPatronymic() {
        return authorPatronymic;
    }

    public void setAuthorPatronymic(String authorPatronymic) {
        this.authorPatronymic = authorPatronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(authorSurName, book.authorSurName) &&
                Objects.equals(authorPatronymic, book.authorPatronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, authorSurName, authorPatronymic);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorSurName='" + authorSurName + '\'' +
                ", authorPatronymic='" + authorPatronymic + '\'' +
                '}';
    }

}
