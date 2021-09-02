package info.krogulec.sda.designpatterns.isp;

public class ClassicTv implements CanDisplay{
    @Override
    public void display() {
        System.out.println("Classic tv displaying something");
    }
}
