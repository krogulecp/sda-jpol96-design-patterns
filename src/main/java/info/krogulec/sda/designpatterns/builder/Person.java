package info.krogulec.sda.designpatterns.builder;

public class Person {
    private final String name;
    private final String surname;
    private final String mothersName;
    private final String fathersName;
    private final String city;
    private final int age;

    private Person(String name, String surname, String mothersName, String fathersName, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.mothersName = mothersName;
        this.fathersName = fathersName;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {
        private String name;
        private String surname;
        private String mothersName = "Janina"; //default
        private String fathersName = "Marek"; //default
        private String city;
        private int age;

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            this.surname = surname;
            return this;
        }

        public Builder withMothersName(String mothersName){
            this.mothersName = mothersName;
            return this;
        }

        public Builder withFathersName(String fathersName){
            this.fathersName = fathersName;
            return this;
        }

        public Builder withCity(String city){
            this.city = city;
            return this;
        }

        public Builder withAge(int age){
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(name, surname, mothersName, fathersName, city, age);
        }
    }
}
