package info.krogulec.sda.designpatterns.liskov;

public class Volounteer extends Employee{
    @Override
    void takeSalary() {
        throw new RuntimeException("I don't take money!!!");
    }
}
