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
        String FileName = "";
        boolean space =false ;
        char[]array = line.toCharArray();
        for(int i = 0; i<array.length;i++){
            if(array[i]!= ' '&& space==false){
                command = command+array[i];
            }
            else {
                space= true;
                FileName = FileName+array[i];
            }
        }
        File file  = new File(FileName);
        Pair pair = new Pair(command,file);
      return pair;
    }

    private void doChoice(String choice,File file){
        switch (choice){
            case "help": fileHelper.showAllCommands(); break;
            case "cd":   fileHelper.changeCurrentLocation(file); break;
            case "find": fileHelper.findFileOrDirectory(file); break;
            case "dir":  fileHelper.createDir(file);
            case "type": fileHelper.showFileContent(file);
            case "del":
            case "mkdir":
            case "mkfile":
            case "tree":
            case "copy":
            case "fc":
            case "exit": System.exit(-1);break;
            default: System.out.println("such of command not exists");

        }

    }



}
