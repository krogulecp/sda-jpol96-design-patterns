package info.krogulec.sda.designpatterns.dip;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Match(List.of(new Defender(), new Midfielder())).match();
    }
}
