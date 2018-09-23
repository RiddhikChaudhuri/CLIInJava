/*
 * @author Sambuddha Chaudhuri
 */
package com.linuxcli.application.command.impl;

import java.io.File;

import com.linuxcli.apllication.constant.CLIConstants;
import com.linuxcli.application.command.ChangeDirectoryCommand;

/**
 * The Class ChangeDirectoryCommandImpl.
 */
public class ChangeDirectoryCommandImpl implements ChangeDirectoryCommand {

    /* 
     * Change the directory using the CD command.It will take care of absolute path.It will take only one input instead of multiple inputs in other cases
     */
    public String changeDirectoryCommand(String filePath) {
        StringBuilder checkForDirectory = new StringBuilder();
        boolean checkForFileDeletion = true;
        if (filePath.contains("..")) {
            /*IF End User wants to go back to previous folder. Here it is taken care*/
            this.changeDirectoryCommandToPreviousFolder(
                    new File(System.getProperty(CLIConstants.GET_USER_DIR)).getParent());
        } else {
            if (filePath.contains(System.getProperty(CLIConstants.GET_USER_DIR))) {
                String lastPartofTheString = filePath.replace(System.getProperty(CLIConstants.GET_USER_DIR), "");
                File file = new File(System.getProperty(CLIConstants.GET_USER_DIR), lastPartofTheString);
                if (!file.exists())
                    checkForFileDeletion = false;
                else
                    System.setProperty(CLIConstants.GET_USER_DIR, file.getAbsolutePath());
            } else {
                File file = new File(System.getProperty(CLIConstants.GET_USER_DIR), filePath);
                if (!file.exists())
                    checkForFileDeletion = false;
                else
                    System.setProperty(CLIConstants.GET_USER_DIR, file.getAbsolutePath());
            }
        }
        if (checkForFileDeletion)
            checkForDirectory.append(CLIConstants.CHANGE_DIRECTORY_SUCCESS);
        else
            checkForDirectory.append(CLIConstants.CHANGE_DIRECTORY_FAILED);

        return checkForDirectory.toString();
    }

    /* 
     * Clear the current Session and setting the Home to Root
     */
    public String changeDirectoryCommandToRoot(String filePath) {
        File file = new File(filePath);
        System.setProperty(CLIConstants.GET_USER_DIR, file.getAbsolutePath());

        return CLIConstants.RESET_TO_FOLDER_SUCCESS;
    }

    /* 
     * Going back to the previous Folder
     */
    public void changeDirectoryCommandToPreviousFolder(String filePath) {
        File file = new File(filePath);
        System.setProperty(CLIConstants.GET_USER_DIR, file.getAbsolutePath());

    }
}
