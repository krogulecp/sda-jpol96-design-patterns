package info.krogulec.sda.designpatterns.factorymethod;

public class Zombie extends Enemy{
    private static final String NAME = "Zombie";
    private static final int POWER = 112;

    public Zombie() {
        super(NAME, POWER);
    }
}
