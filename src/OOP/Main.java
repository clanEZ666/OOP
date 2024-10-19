package OOP;

public class Main {
    public static void main(String[] args) {

        //Авторы книг
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");

        // Книги
        Book dubrovski = new Book("Дубровкий", pushkin, 1841);
        Book WarAndPeace = new Book("Война и мир", tolstoy, 1867);

        System.out.println(WarAndPeace.BookInfo());
        System.out.println(dubrovski.BookInfo());


    }
}
