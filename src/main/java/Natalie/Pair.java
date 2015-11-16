package Natalie;

import java.io.File;

/**
 * Created by Family on 11/16/2015.
 */
public class Pair {

    private String command;
    private File fileName;

    public Pair(){

    }

    public Pair(String command, File fileName) {
        this.command = command;
        this.fileName = fileName;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public File getFileName() {
        return fileName;
    }

    public void setFileName(File fileName) {
        this.fileName = fileName;
    }

}
