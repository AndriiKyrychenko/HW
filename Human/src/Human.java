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

    public static void main(String[] args) {

        Human humanOne = new Human("Колокольчиков", "Николай", "Апполинариевич");
        Human humanTwo = new Human("Виноградов", "Алексей");
        Human[] people = {humanOne, humanTwo};

        getShortName(people);
        getFullName(people);
    }

    public static void getFullName(Human[] people) {
        for (Human human : people) {
            if (human.patronymic == null) {
                System.out.println(human.surname + " " + human.name);
            } else {
                System.out.println(human.surname + " " + human.name + " " + human.patronymic);
            }
        }
        System.out.println();
    }

    public static void getShortName(Human[] people) {
        for (Human human : people) {
            if (human.patronymic == null) {
                System.out.println(human.surname + " " + human.name.charAt(0) + ".");
            } else {
                System.out.println(human.surname + " " + human.name.charAt(0) + ". " + human.patronymic.charAt(0) + ".");
            }
        }
        System.out.println();
    }
}