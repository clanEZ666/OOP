package OOP;

public class Book {
    // Данные о книге
    private String title;
    private Author author;
    private int year;


    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }


    //переопредление метода в toString

    @Override
    public String toString() {
        return "Название: " + title + "\nАвтор: " + author.toString() + "\nГод: " + year;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}

