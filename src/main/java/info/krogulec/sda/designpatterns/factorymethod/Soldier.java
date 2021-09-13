package info.krogulec.sda.designpatterns.factorymethod;

public class Soldier extends Enemy{
    private static final String NAME = "Soldier";
    private static final int POWER = 66;

    public Soldier() {
        super(NAME, POWER);
    }
}
