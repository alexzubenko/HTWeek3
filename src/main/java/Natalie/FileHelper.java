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
    private File root = new File("C:\\Users\\Family");
    private Map allCommands;
    private Utils utils;

    public File getRoot() {
        return root;
    }

    public void setRoot(File root) {
        this.root = root;
    }
;

    public FileHelper() {
        utils = new Utils();
        allCommands = new HashMap<String,String>();
        loadMap();
    }

    private void loadMap(){
        allCommands.put("help","show all available commands \n");
        allCommands.put("cd","change the directory \n");
        allCommands.put("find","find file or directory \n");
        allCommands.put("dir","show directory content \n");
        allCommands.put("type","show file content \n");
        allCommands.put("del","delete file \n");
        allCommands.put("mkdir","create directory \n");
        allCommands.put("mkfile","create file \n");
        allCommands.put("tree","show folder structure \n");
        allCommands.put("copy","copy file \n");
        allCommands.put("fc","compare content of two files \n");

    }

    public void showAllCommands(){
        System.out.println(allCommands);

    }

    public File changeCurrentLocation(File directory ){
       //System.out.println(root.getAbsolutePath());
        if (directory.exists() || directory.mkdirs())
        {
        setRoot(directory);
    } else {
            System.out.println("such of directory not exists");
        }
        return getRoot();
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
