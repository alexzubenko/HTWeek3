package Alex;

import java.io.File;

/**
 * Created by alex on 15.11.15.
 */
public class IO {

    static String path = new File("").getAbsolutePath();

    //File file_new = new File(path);


    public static void main (String[] args) {

        File file_new = new File(path);
        System.out.println(file_new.getAbsolutePath());


    }






}
