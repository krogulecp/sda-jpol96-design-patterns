package info.krogulec.sda.designpatterns.liskov;

// relacja dziedziczenia -> Manager jest Pracownikiem
public class Manager extends Employee{

    //relacja kompozycji -> Manager ma imię
    private String name;
}
