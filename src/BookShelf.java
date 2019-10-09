import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    List<Book> books = new ArrayList<>();
    static BookShelf bookShelf = new BookShelf();
    public static BookShelf getInstance() {
        return bookShelf;
    }

    public  Book search(String ISBN) throws NoSuchBookException{
        for(Book book : books){
            if(book.ISBN.equals(ISBN) ){
                return book;
            }
        }
        throw new NoSuchBookException();
    }

    public void putBook(Book book) {
        books.add(book);
    }
}
