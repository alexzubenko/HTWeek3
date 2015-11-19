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

    private File startPath = new File("/home/alex/java");


    private Map<String,String> helpMap;


    public FileHelper() {
        initialisation();
    }

    public File getStartPath() {
        return startPath;
    }

    public void initialisation(){

        helpMap = new HashMap<String, String>();
        helpMap.put("help","show all available commands");
        helpMap.put("cd","changeCurrentLocation");
        helpMap.put("find","find file(dir)s");
        helpMap.put("dir","show directoryContent");
        helpMap.put("type","show file (Content)");
        helpMap.put("delete","delete file or dir");
        helpMap.put("mkdir","create directory");
        helpMap.put("create","create file");
        helpMap.put("tree","show folder structure");
        helpMap.put("copy","copy file");
        helpMap.put("fc","compare content of files");


    }

    public void changeCurrentLocation (File newPath){

        startPath = newPath;


    }

    public void ShowAllCommands (){

        for (Map.Entry entry : helpMap.entrySet()) {
            System.out.println(entry.getKey() + " - "+ entry.getValue());
        }


    }



    public void createDirectory(File directoryName){
        directoryName.mkdir();
        System.out.println("Directory " + startPath + "/"+ directoryName.getName() + " has been created");
    }




    public void showFileContent(File fileName) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = null;
        try {
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void showDirectoryContent(File directory){
        File [] list = directory.listFiles();
        for (File file:list){
        System.out.println(file);}
    }

    public void createFile(File filename){
        try {
            filename.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void deleteFileDir(File nameToDelete){
        nameToDelete.delete();
    }





    public void showFolderTree( File path ) {


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







}
