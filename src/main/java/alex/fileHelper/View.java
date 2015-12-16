package alex.fileHelper;

import java.io.File;
import java.util.Scanner;

/**
 * Created by alex on 16.11.15.
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
        System.out.println("Welcome to the java commandline, please type  help   to see all available commannds ");
        while(true) {
            System.out.println(fileHelper.getStartPath()+">");
            inputList = getUserInput();
            choice = inputList[0];
            if(inputList[1]!=null) {
                file = new File(fileHelper.getStartPath().getAbsolutePath() + "/" + inputList[1]);
                simpleFileName = inputList[1];
            }
            doChoice(file, simpleFileName, choice);
        }}



    private void doChoice(File file, String simpleFileName, String choice){
        switch (choice){
            case "help": fileHelper.ShowAllCommands(); break;
            case "cd":   fileHelper.changeCurrentLocation(file); break;
            case "find":// System.out.println(fileHelper.findFileOrDirectory(simpleFileName)); break;
            case "ls":  fileHelper.showDirectoryContent(file);break;
            case "type": fileHelper.showFileContent(file);break;
            case "del":  fileHelper.deleteFileDir(file);break;// why do not delete folders with files inside??
            case "mkdir": fileHelper.createDirectory(file);break;
            case "cat":fileHelper.createFile(file);break;
            case "tree": fileHelper.showFolderTree(file);break;
            case "copy":fileHelper.copyFile(file);break;
            case "fc":
            case "cd..":fileHelper.backToThePreviousFolder(); break;
            case "quit": System.exit(-1);break;
            default: System.out.println("such of command not exists");

        }

    }
}
