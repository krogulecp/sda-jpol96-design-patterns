package info.krogulec.sda.designpatterns.isp;

public class TvUser {
    public static void main(String[] args) {
        CanConnectToInternet smartTv = new SmartTv();
        CanDisplay classicTv = new ClassicTv();

        smartTv.connectToInternet();
        classicTv.display();

    }
}
