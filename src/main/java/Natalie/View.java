package Natalie;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Family on 11/16/2015.
 */
public class View {

 private Scanner scanner;
 private String choice;
 private FileHelper fileHelper;
 private String fileName;

    public View (){
        scanner = new Scanner(System.in);
        fileHelper = new FileHelper();
        start();
    }

    public void start() {
        while(true) {
            System.out.println(fileHelper.getRoot());
            Pair pair = getInput();
            choice = pair.getCommand();
            File file = pair.getFileName();
            doChoice(choice,file);
        }

    }

    private Pair getInput()  {
        String line = scanner.nextLine();
        String command = "";
        fileName = "";
        boolean space =false ;
        char[]array = line.toCharArray();
        for(int i = 0; i<array.length;i++){
            if(array[i]!=' '&& !space){
                command = command+array[i];
            }
            else{
                space= true;
                fileName=fileName+array[i];
            }
        }
        File file  = new File(fileHelper.getRoot().getAbsolutePath()+"\\"+fileName.substring(0));
        Pair pair = new Pair(command,file);
      return pair;
    }

    private void doChoice(String choice,File file){
        switch (choice){
            case "help": fileHelper.showAllCommands(); break;
            case "cd":   fileHelper.changeCurrentLocation(file); break;
            case "find": System.out.println(fileHelper.findFileOrDirectory(fileName.substring(0))); break;//
            case "dir":  fileHelper.showDirectoryContent(file);break;
            case "type": fileHelper.showFileContent(file);break;//
            case "del":  fileHelper.deleteFileOrDir(file);break;//
            case "mkdir":fileHelper.createDir(file);break;
            case "mkfile":fileHelper.createFile(file);break;
            case "tree":
            case "copy":
            case "fc":
            case "exit": System.exit(-1);break;
            default: System.out.println("such of command not exists");

        }

    }



}
