package Alex.FileHelper;

import java.io.File;
import java.util.Scanner;

/**
 * Created by alex on 16.11.15.
 */
public class View {



    private Scanner scanner;
    private String choice;
    private FileHelper fileHelper;

    public View (){
        scanner = new Scanner(System.in);
        start();
        fileHelper = new FileHelper();
    }

    public void start() {
        while(true) {
            System.out.println("enter the command");
            Para para = getInput();
            choice = para.getCommand();
            File file = para.getFileDirectoryName();
            doChoice(choice,file);
        }

    }

    private Para getInput()  {
        String line = scanner.nextLine();
        String command = line.substring(0,line.indexOf(" "));
        String FileName = line.substring(line.indexOf(" "),line.length());
        File file  = new File(FileName);
        Para para = new Para(command,file);
        return para;
    }

    private void doChoice(String choice,File file){
        switch (choice){
            case "help": fileHelper.ShowAllCommands(); break;
            case "cd":   fileHelper.changeCurrentLocation(file); break;
            case "find": fileHelper.findFileOrDirectory(file); break;
            case "dir":  fileHelper.showDirectoryContent(file);break;
            case "type": fileHelper.showFileContent(file);break;
            case "del":  fileHelper.deleteFileDir(file);break;
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
