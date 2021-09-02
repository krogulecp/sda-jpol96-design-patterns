package info.krogulec.sda.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .withCity("Warsaw")
                .withName("Jan")
                .withFathersName("Bolek")
                .withMothersName("Krystyna")
                .build();

        System.out.println(person);
    }
}
