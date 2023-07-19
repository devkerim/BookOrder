import java.util.Date;

public class Book implements Comparable<Book> {
    private int pageNumber;
    private String bookName;
    private String author;
    private int publishDate;

    public Book(int pageNumber, String bookName, String author, int publishDate){
        this.pageNumber = pageNumber;
        this.bookName = bookName;
        this.author = author;
        this.publishDate = publishDate;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public int getPublishDate() {
        return publishDate;
    }




    @Override
    public int compareTo(Book o) {
        return this.getBookName().compareTo(o.getBookName());
    }
}
