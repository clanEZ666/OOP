package OOP;

public class Author {
    // Информация об авторе
    private String firstName;
    private String lastName;

    // Создание обьекта
    public Author(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    // Метод, который возвращает полное имя автора в виде строки
    public String getFullName() {
        return firstName + " " + lastName;
    }
}

