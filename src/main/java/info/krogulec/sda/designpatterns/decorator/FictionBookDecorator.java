package info.krogulec.sda.designpatterns.decorator;

public class FictionBookDecorator extends BookDecorator{
    public FictionBookDecorator(Book book) {
        super(book);
    }

    @Override
    public String describe() {
        return "Fiction " + super.describe();
    }
}
