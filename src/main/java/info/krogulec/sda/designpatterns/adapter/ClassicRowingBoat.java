package info.krogulec.sda.designpatterns.adapter;

public class ClassicRowingBoat implements RowingBoat{
    @Override
    public void row() {
        System.out.println("Classic rowing boat is rowing!");
    }
}
