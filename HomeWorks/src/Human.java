public class Human {

    String surname;
    String name;
    String patronymic;

    public Human(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Human(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
}