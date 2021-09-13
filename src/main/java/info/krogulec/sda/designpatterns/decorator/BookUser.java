package info.krogulec.sda.designpatterns.decorator;

public class BookUser {
    public static void main(String[] args) {
        Book book = new BasicBook();

        Book fictionBook = new FictionBookDecorator(book);

        Book scienceFictionBook = new ScienceBookDecorator(fictionBook);

        Book scienceFictionBook2 = new ScienceBookDecorator(new FictionBookDecorator(new BasicBook()));

        System.out.println(scienceFictionBook.describe());
    }
}
