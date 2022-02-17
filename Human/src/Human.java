import java.util.Objects;

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
    @Override
    public String toString() {
        return "Human{" + "surname=" + surname
                + ", name=" + name
                + ", patronymic=" + patronymic
                + "}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Human human = (Human) object;
        return Objects.equals(surname, human.surname) &&
                Objects.equals(name, human.name) &&
                Objects.equals(patronymic, human.patronymic);
    }

    @Override
    public int hashCode() {
        int factor = 31;
        int result = 1;
        result = factor * result + ((surname == null) ? 0 : surname.hashCode());
        result = factor * result + ((name == null) ? 0 : name.hashCode());
        result = factor * result + ((patronymic == null) ? 0 : patronymic.hashCode());
        return result;
    }
}