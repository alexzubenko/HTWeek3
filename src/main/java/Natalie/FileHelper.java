package Natalie;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Family on 11/16/2015.
 */
public class FileHelper {

  private File root = new File("C:/");
   private Map allCommands;
    private Utils utils;

    public FileHelper() {
        utils = new Utils();
        loadMap();
    }

    private void loadMap(){
        allCommands = new HashMap<String,String>();
        allCommands.put("help","show all available commands");
        allCommands.put("cd","change the directory");
        allCommands.put("find","find file or directory");
        allCommands.put("dir","show directory content");
        allCommands.put("type","show file content");
        allCommands.put("del","delete file");
        allCommands.put("mkdir","create directory");
        allCommands.put("mkfile","create file");
        allCommands.put("tree","show folder structure");
        allCommands.put("copy","copy file");
        allCommands.put("fc","compare content of two files");

    }

    public void showAllCommands(){
        System.out.println(allCommands);

    }

    public File changeCurrentLocation(File newLocation ){
        root = newLocation;
        return root;
    }

       public String findFileOrDirectory(File fileOfDir){
           File[] matchingFiles = root.listFiles(new FilenameFilter() {
               public boolean accept(File dir, String name) {
                   return name.startsWith(fileOfDir.toString());
               }
           });
              return null;
       }



    public void showDirectoryContent(File directory){
        System.out.println(directory.list());
     }

    public void showFileContent(File file){
      String output = (String )utils.load(file.getPath());
        System.out.println(output);

    }

 public void deleteFileOrDir(File fileToDelete){
     fileToDelete.delete();
 }

    public boolean createDir(File dirToCreate){
       return dirToCreate.mkdir();

    }

    public boolean createFile(File fileToCreate){
        try {
            return fileToCreate.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void showFolderTree(File folder){

        for (final File f : folder.listFiles()) {
            if (f.isDirectory()) {
                showFolderTree(f);
            } else {
                System.out.println(f.getName());
            }
        }

    }
    public File copyFile(File fileToCopy){

        return null;
    }

    public void deepFind(String keyWord){

    }

}
