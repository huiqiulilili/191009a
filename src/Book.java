public class Book {
    String ISBN;
    String title;
    String author;
    double price;
    int currentCount;
    int totalCount;
    int browedCount;

    public Book(String ISBN, String title, String author, double price, int count) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.currentCount = count;
        this.totalCount = count;
        this.browedCount = 0;
    }


    public void increaseCount(int count) {
        currentCount += count;
        totalCount += count;
    }
}
