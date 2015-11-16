package Alex.FileHelper;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by alex on 16.11.15.
 */

public class FileHelper {


    //static String startPath = new File("").getAbsolutePath();
    static String startPath = "/home/alex/test";
    private String currentPath = startPath;
    private Map<String,String> helpMap;


    public FileHelper() {
        initialisation();
    }

    public String getCurrentPath() {
        return currentPath;
    }

    public void setCurrentPath(String currentPath) {
        this.currentPath = currentPath;
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

    public void changeCurrentLocation (String destination){

        setCurrentPath(getCurrentPath()+destination);


    }


    public void ShowAllCommands (){

        for (Map.Entry entry : helpMap.entrySet()) {
            System.out.println(entry.getKey() + " - "+ entry.getValue());
        }


    }

    public void createDirectory(String directoryName){
        File file = new File(currentPath+"/"+directoryName);
        file.mkdir();
        System.out.println("Directory " + file.getAbsolutePath() + " created");
    }











}
