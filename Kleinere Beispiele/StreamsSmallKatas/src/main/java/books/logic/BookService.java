package books.logic;

import books.data.Book;

import java.util.List;

public class BookService {
    //Erhalte eine Liste aller Buchtitel,
    // die in einer Bücherliste veröffentlicht wurden.
    public List<String> getTitlesOfPublishedBooks(List<Book> books) {
        return books.stream()
                .filter(Book::isPublished)
                .map(book -> book.title())
                .toList();
    }
}
