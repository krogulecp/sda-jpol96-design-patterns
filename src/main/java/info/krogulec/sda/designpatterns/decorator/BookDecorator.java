package info.krogulec.sda.designpatterns.decorator;

public abstract class BookDecorator implements Book {
    protected Book book;

    public BookDecorator(Book book) {
        this.book = book;
    }

    @Override
    public String describe() {
        return book.describe();
    }
}
