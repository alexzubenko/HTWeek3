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
 private String [] inputList;
 private File file;
 private String simpleFileName;

    public View (){
        scanner = new Scanner(System.in);
        fileHelper = new FileHelper();
        start();
    }
    private String[] getUserInput(){
        String line = scanner.nextLine();
        inputList = new String[10];
        if (line.contains(" ")){
            inputList = line.split(" ");
        }
        else { inputList[0] = line;}
        return inputList;
    }

    public void start() {
        while(true) {
            System.out.println(fileHelper.getRoot()+">");
            inputList = getUserInput();
            choice = inputList[0];
            if(inputList[1]!=null) {
                file = new File(fileHelper.getRoot().getAbsolutePath() + "\\" + inputList[1]);
                simpleFileName = inputList[1];
            }
            doChoice(file, simpleFileName, choice);
    }}




    private void doChoice(File file, String simpleFileName, String choice){
        switch (choice){
            case "help": fileHelper.showAllCommands(); break;
            case "cd":   fileHelper.changeCurrentLocation(file); break;
            case "find":// System.out.println(fileHelper.findFileOrDirectory(simpleFileName)); break;
            case "dir":  fileHelper.showDirectoryContent(file);break;
            case "type": fileHelper.showFileContent(file);break;
            case "del":  fileHelper.deleteFileOrDir(file);break;// why do not delete folders with files inside??
            case "mkdir": fileHelper.createDir(file);break;
            case "mkfile":fileHelper.createFile(file);break;
            case "tree": fileHelper.showFolderTree(file);break;
            case "copy":
            case "fc":
            case "cd..":fileHelper.getToThePreviousFolder(); break;
            case "exit": System.exit(-1);break;
            default: System.out.println("such of command not exists");

        }

    }



}
