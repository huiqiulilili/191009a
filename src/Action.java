public class Action {
    public static Book putBook(String ISBN,String title,String author,double price,int count){
        BookShelf bookShelf = BookShelf.getInstance();
        try{
            Book book = bookShelf.search(ISBN);
            book.increaseCount(count);
            return book;
        }catch (NoSuchBookException e){
            Book book = new Book(ISBN,title,author,price,count);
            bookShelf.putBook(book);
            return book;
        }
    }
}
