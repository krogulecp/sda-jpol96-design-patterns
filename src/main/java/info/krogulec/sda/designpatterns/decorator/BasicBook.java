package info.krogulec.sda.designpatterns.decorator;

public class BasicBook implements Book{
    @Override
    public String describe() {
        return "Basic book";
    }
}
