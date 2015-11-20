package Alex.FileHelper;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by alex on 16.11.15.
 */
public class RunFileFilter {

    public static void main (String[] args) throws FileNotFoundException {

        FileHelper fl = new FileHelper();
        File file = new File("/home/alex/test/sample.txt");

        //fl.ShowAllCommands();
       //fl.createDirectory(file);

        fl.showFileContent(file);



        //fl.showDirectoryContent(file);

        //fl.createFile(file);

        //fl.deleteFileDir(file);
        //fl.showFolderTree(file);

        //fl.findFile(file);

        //System.out.println(fl.findFileOrDirectory(file));







    }
    

}
