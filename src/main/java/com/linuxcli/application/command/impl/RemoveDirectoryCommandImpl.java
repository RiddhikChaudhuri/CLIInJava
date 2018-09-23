/*
 * @autor Sambuddha Chaudhuri
 * 
 */
package com.linuxcli.application.command.impl;

import java.io.File;

import com.linuxcli.apllication.constant.CLIConstants;
import com.linuxcli.application.command.ChangeDirectoryCommand;
import com.linuxcli.application.command.RemoveDirectoryCommand;

public class RemoveDirectoryCommandImpl implements RemoveDirectoryCommand {

    private ChangeDirectoryCommand changeDirectoryCommand = new ChangeDirectoryCommandImpl();

    /* 
     * Remove Directories either from Relative Path or from Absolute Path
     */
    @Override
    public String removeDirectory(String[] directoryList) {
        StringBuilder checkForDirectory = new StringBuilder();
        boolean checkForFileDeletion = true;
        for (int i = 1; i < directoryList.length; i++) {
            /*This Check is done for Absolute path.To work with Absolute Path We are checking*/
            if (directoryList[i].contains(System.getProperty(CLIConstants.GET_USER_DIR))) {
                String lastPartofTheString = directoryList[i].replace(System.getProperty(CLIConstants.GET_USER_DIR),
                        "");
                File file = new File(System.getProperty(CLIConstants.GET_USER_DIR), lastPartofTheString);
                /*Checking for whether the Directory List is the Directory in which the user is in
                 *  If the user is in moving the user_home_directory to the parent directory
                 */
                if (lastPartofTheString.equals("")) {
                    changeDirectoryCommand
                            .changeDirectoryCommandToPreviousFolder(file.getParentFile().getAbsolutePath());
                    checkForFileDeletion = recursivelyDeleteFiles(file);
                } else {
                    checkForFileDeletion = recursivelyDeleteFiles(file);
                }
            } else {
                /*If it is not absolute and relative Path Just Delete as it is recursively*/
                File file = new File(System.getProperty(CLIConstants.GET_USER_DIR), directoryList[i]);
                checkForFileDeletion = recursivelyDeleteFiles(file);
            }
        }
        if (checkForFileDeletion)
            checkForDirectory.append(CLIConstants.REMOVE_DIRECTORY_SUCCESS);
        else
            checkForDirectory.append(CLIConstants.REMOVE_DIRECTORY_NOT_EXISTS);

        return checkForDirectory.toString();
    }

    private static boolean recursivelyDeleteFiles(File file) {
        //to end the recursive loop
        if (!file.exists())
            return false;
        else {
            //if directory, go inside and call recursively
            if (file.isDirectory()) {
                for (File f : file.listFiles()) {
                    //call recursively
                    recursivelyDeleteFiles(f);
                }
            }
            //call delete to delete files and empty directory
            return file.delete();
        }
    }

}
