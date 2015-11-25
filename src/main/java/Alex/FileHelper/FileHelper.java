package Alex.FileHelper;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.nio.file.StandardCopyOption.*;

/**
 * Created by alex on 16.11.15.
 */

public class FileHelper {


    //static String startPath = new File("").getAbsolutePath();



    private File startPath = new File("/home/alex/test");
    private Utils utils;

    public void setStartPath(File startPath) {
        this.startPath = startPath;
    }

    private Map<String,String> helpMap;


    public FileHelper() {
        initialisation();
        utils = new Utils();
    }

    public File getStartPath() {
        return startPath;
    }

    public void initialisation(){

        helpMap = new HashMap<String, String>();
        helpMap.put("help","show all available commands");
        helpMap.put("cd","changeCurrentLocation");
        helpMap.put("cd..","backToParentFolder");
        helpMap.put("find","find file(dir)s");
        helpMap.put("ls","show directoryContent");
        helpMap.put("type","show file (Content)");
        helpMap.put("del","delete file or dir");
        helpMap.put("mkdir","create directory");
        helpMap.put("cat","create file");
        helpMap.put("tree","show folder structure");
        helpMap.put("copy","copy file");
        helpMap.put("fc","compare content of files");
        helpMap.put("quit","Exit the java commandline");


    }

    public File changeCurrentLocation(File directory ){
        if (directory.exists())
        {
            setStartPath(directory);
        } else {
            System.out.println("such of directory not exists");
        }
        return getStartPath();
    }

    public String findFileOrDirectory(String fileOfDir){
        File[] matchingFiles = startPath.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith(fileOfDir);
            }
        });
        return null;
    }

    public File backToThePreviousFolder(){return startPath = (new File(startPath.getParent()));}


    public void ShowAllCommands(){

        for (Map.Entry entry : helpMap.entrySet()) {
            System.out.println(entry.getKey() + " - "+ entry.getValue());
        }


    }



    public boolean createDirectory(File directoryName){
       System.out.println("Directory " + startPath + "/"+ directoryName.getName() + " has been created");
        return directoryName.mkdir();
    }



    //Another useful variant of showFileContent
    /*public void showFileContent(File fileName) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = null;
        try {
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/


// to-do need to use the save method before use the load one


    public void pushContentToFile(String path,String content){
        utils.save(path, content);


    }

    /*public void showFileContent(File file){
        String output = (String)utils.load(file.getPath());
        System.out.println(output);

    }*/


    public String showFileContent(File file){
        String output = utils.fileReader(file.getPath());//+".txt");
        System.out.println(output);
        return output;
    }


    public void showDirectoryContent(File directory){
        if (directory==null) {
            File[] list = startPath.listFiles();
            for (File file : list) {
                System.out.println(file);
            }
        }
        else{
        File [] list = directory.listFiles();
        for (File file:list){
        System.out.println(file);}}
    }




    public boolean createFile(File filename){
        try {
            return filename.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }


    public void deleteFileDir(File nameToDelete){
        nameToDelete.delete();
    }


    public void showFolderTree( File path ){

        if (path == null){
            File[] list = startPath.listFiles();


            if (list == null) return;

            for (File f : list) {
                if (f.isDirectory()) {
                    showFolderTree(new File(f.getAbsolutePath()));
                    System.out.println("Dir:" + f.getAbsoluteFile());
                } else {
                    System.out.println("File:" + f.getAbsoluteFile());
                }
            }

        }
        else {

            File[] list = path.listFiles();


            if (list == null) return;

            for (File f : list) {
                if (f.isDirectory()) {
                    showFolderTree(new File(f.getAbsolutePath()));
                    System.out.println("Dir:" + f.getAbsoluteFile());
                } else {
                    System.out.println("File:" + f.getAbsoluteFile());
                }
            }

        }

    }



    /*public void findFile(File filename){

        File[] list = startPath.listFiles();

        if (list == null) return;

        for (File f:list){
            if (f.isDirectory()){
                findFile(new File(f.getAbsolutePath()));
            } else {
                if (f.equals(filename)){
                    System.out.println(f.getAbsolutePath());
                }
                else{System.out.println("Not that guy");}

            }
        }

    }*/

//Doesnot work
    public String findFileOrDirectory(final File fileOfDir){

        File[] matchingFiles = startPath.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith(fileOfDir.toString());
            }
        });
        return null;
    }


    public File copyFile(File fileToCopy){
        String fileContent = showFileContent(fileToCopy);
        File fileCopy = new File (fileToCopy.getPath()+"_copy");
        createFile(fileCopy) ;
        utils.fileWriter(fileCopy,fileContent);
        return null;
    }


    //To-do
    public boolean compareContentOfFiles(File file1,File file2){
        return true;
    }







}
