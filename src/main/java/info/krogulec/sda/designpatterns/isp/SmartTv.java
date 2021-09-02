package info.krogulec.sda.designpatterns.isp;

public class SmartTv implements CanDisplay, CanConnectToInternet {
    @Override
    public void display() {
        System.out.println("Smart tv displaing something");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Smart tv connecting to internet");
    }
}
