package OOP;

import java.lang.reflect.AnnotatedArrayType;

public class Main {
    public static void main(String[] args) {

        
        //Авторы книг
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");

        // Книги
        Book dubrovski = new Book("Дубровкий", pushkin, 1841);
        Book WarAndPeace = new Book("Война и мир", tolstoy, 1867);


        //Изменение названия и года для первой книги
        dubrovski.setTitle("Дубровский(измененное название )");
        dubrovski.setYear(2024);

        //Изменение автора второй книги
        Author dostoevsky = new Author("Федор","Достоевский");
        WarAndPeace.setAuthor(dostoevsky);
        System.out.println(WarAndPeace.toString());
        System.out.println(dubrovski.toString());

    }
}
