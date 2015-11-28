package Alex.Library;

import java.util.List;

/**
 * Created by alex on 25.11.15.
 */
public class LibraryStore {

    private List<Book> bookList;
    private List<Reader> readerList;

    public List<Book> getBookList() {
        return bookList;
    }

    public List<Reader> getReaderList() {
        return readerList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void setReaderList(List<Reader> readerList) {
        this.readerList = readerList;
    }

}
