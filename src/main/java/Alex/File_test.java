package Alex;

import java.io.File;
import java.io.IOException;

/**
 * Created by alex on 15.11.15.
 */
public class File_test {


    String path = new File("").getAbsolutePath();


    //public File_test() {
    //}

    public void create_file(String name){

        File file = new File(path+name);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public void delete_file(String name){

        File file = new File(path+name);


            file.delete();



    }


    public static void main (String[] args) {


        new File_test().delete_file("/testContainer.txt");



    }
}
