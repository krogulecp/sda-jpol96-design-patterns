package info.krogulec.sda.designpatterns.decorator;

public class ScienceBookDecorator extends BookDecorator {
    public ScienceBookDecorator(Book book) {
        super(book);
    }

    @Override
    public String describe() {
        return "Science " + super.describe();
    }
}
