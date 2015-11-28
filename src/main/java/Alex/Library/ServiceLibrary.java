package Alex.Library;

import java.util.List;

/**
 * Created by alex on 25.11.15.
 */
public class ServiceLibrary {


   private LibraryStore libraryStore = new LibraryStore();


    public void getAllBooks(){

        List<Book> booklist =  libraryStore.getBookList();
        for (Book b:booklist){
            System.out.println(b);
        }

    }

    public void getAllReaders(){
        List<Reader>readerslist = libraryStore.getReaderList();
        for (Reader r:readerslist){
            System.out.println(r);
        }
    }

    /*public void setBlackSign(String name){
        List<Reader>readerList = libraryStore.getReaderList();
        if (readerList.)


    }
*/



}
