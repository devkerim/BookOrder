
import java.util.*;

public class Main {


    public static void main(String[] args) {

        TreeSet<Book> book = new TreeSet<Book>();
        Book book1= new Book(320,"Java Programlama","Ahmet Yılmaz",2020);
        Book book2= new Book(250,"Denemeler","Montaigne",1580);
        Book book3= new Book(500,"Gurur Ve Önyargı","Jane Austin",1876);
        Book book4= new Book(168,"Python Öğreniyorum","Yılmaz Ertürk",2018);
        Book book5= new Book(32,"Keloğlan Masalları","Mustafa Aslan",2022);

        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        book.add(book5);

        System.out.println("----- İSİMLERE GÖRE A'DAN Z'YE SIRALI -----");
        for (Book kitap : book) {
            System.out.println("Kitap İsmi: " + kitap.getBookName());
        }



        Set<Book> books = new TreeSet<>((b1, b2) -> b1.getPageNumber() - b2.getPageNumber());
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);


        System.out.println("\n----- SAYFA SAYISINA GÖRE SIRALI -----");
        for (Book kitap : books) {
            System.out.println("Kitap İsmi: " + kitap.getBookName() + ", Sayfa Sayısı: " + kitap.getPageNumber());
        }



    }
}
