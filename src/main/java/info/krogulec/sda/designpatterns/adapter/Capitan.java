package info.krogulec.sda.designpatterns.adapter;

public class Capitan {
    private RowingBoat rowingBoat;

    public Capitan(RowingBoat rowingBoat){
        this.rowingBoat = rowingBoat;
    }

    void row(){
        rowingBoat.row();
    }
}
