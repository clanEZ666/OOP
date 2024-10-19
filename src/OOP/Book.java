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


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    // вывод информации о книге
    public String BookInfo() {
        return "Название: " + title + "\nАвтор: " + author.getFullName() + "\nГод: " + year;

    }
}

