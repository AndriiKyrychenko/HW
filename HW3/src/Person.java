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
    }

    public static void main(String[] args) {

        Person personOne = new Person("Колокольчиков", "Николай", "Апполинариевич");
        Person personTwo = new Person("Петров-Зябликов Хуан Эмманулович");

        System.out.println(personOne.surname + " " + personOne.name + " " + personOne.patronymic);
        System.out.println(personTwo.fullName);

        Person.parseName(personTwo);
    }

    public static void parseName(Person person) {
        String[] arrName = person.fullName.split(" ", 3);
        person.surname= arrName[0];
        person.name=arrName[1];
        person.patronymic=arrName[2];
        System.out.println();
        System.out.println("разбиение строки fullName и присвоение значений в surname, name, patronymic: ");
        System.out.println("surname: " + person.surname);
        System.out.println("name: " + person.name);
        System.out.println("patronymic: " + person.patronymic);
    }
}
