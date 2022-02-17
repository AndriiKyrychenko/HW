public class Person {

    private String surname;
    private String name;
    private String patronymic;
    private String fullName;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Person(String fullName) {
        this.fullName = fullName;
        String[] arrName = fullName.split(" ", 3);
        surname = arrName[0];
        name = arrName[1];
        patronymic = arrName[2];
        System.out.println("разбиение fullName " + fullName + " и присвоение значений в surname, name, patronymic: ");
        System.out.println();
        System.out.println("surname: " + surname);
        System.out.println("name: " + name);
        System.out.println("patronymic: " + patronymic);

    }

    public static void main(String[] args) {

        Person personOne = new Person("Колокольчиков", "Николай", "Апполинариевич");
        Person personTwo = new Person("Петров-Зябликов Хуан Эмманулович");

        System.out.println();
        System.out.println("полное имя заданное конструктором с полями  surname, name, patronymic " + personOne.surname + " " + personOne.name + " " + personOne.patronymic);
        System.out.println("полное имя заданное конструктором с полем fullName: " + personTwo.fullName);

    }
}
