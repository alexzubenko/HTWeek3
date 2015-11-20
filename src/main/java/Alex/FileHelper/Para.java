package Alex.FileHelper;

import java.io.File;

/**
 * Created by alex on 16.11.15.
 */
public class Para {

    private String command;
    private File fileDirectoryName;


    public Para() {
    }

    public Para(String command, File fileDirectoryName) {
        this.command = command;
        this.fileDirectoryName = fileDirectoryName;
    }

    public String getCommand() {
        return command;
    }

    public File getFileDirectoryName() {
        return fileDirectoryName;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public void setFileDirectoryName(File fileDirectoryName) {
        this.fileDirectoryName = fileDirectoryName;
    }
}
