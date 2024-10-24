package OOP;

public class Author {
    // Информация об авторе
    private String firstName;;
    private String lastName;


    // Создание пустого конструтора
    public Author () {

    }
    // Создание обьекта
    public Author(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }


    // toString метод для возвращения в виде строки
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}

