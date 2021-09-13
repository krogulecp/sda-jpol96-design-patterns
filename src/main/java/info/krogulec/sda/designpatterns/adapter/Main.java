package info.krogulec.sda.designpatterns.adapter;

public class Main {

    public static void main(String[] args) {
        Capitan capitan = new Capitan(new ClassicRowingBoat());
        capitan.row();
        Capitan capitan2 = new Capitan(new FishingBoatAdapter(new FishingBoat()));
        capitan2.row();
    }
}
