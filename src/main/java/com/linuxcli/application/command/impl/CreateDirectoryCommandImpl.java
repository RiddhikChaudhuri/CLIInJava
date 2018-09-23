/*
 * @author Sambuddha Chaudhuri
 */
package com.linuxcli.application.command.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.linuxcli.apllication.constant.CLIConstants;
import com.linuxcli.application.command.CreateDirectoryCommand;

public class CreateDirectoryCommandImpl implements CreateDirectoryCommand {

    /*
     * Create New Directory Command is taken care inside this function
     */
    @Override
    public String createDirectory(String[] directoryNames) {
        StringBuilder checkForDirectory = new StringBuilder();
        boolean checkForFileCreationSuccess = true;
        String characterOfUserDirectory = System.getProperty(CLIConstants.GET_USER_DIR);
        for (int i = 1; i < directoryNames.length; i++) {
            if (directoryNames[i].split("/").length > 1) {
                try {
                    /*If absolute Path is Given It will be taken care here*/
                    Files.createDirectories(Paths.get(directoryNames[i]));
                    checkForFileCreationSuccess = true;
                } catch (IOException e) {
                    checkForFileCreationSuccess = false;
                }
            } else {
                File file = new File(characterOfUserDirectory, directoryNames[i]);
                if (file.exists())
                    checkForFileCreationSuccess = false;
                else
                    file.mkdir();
            }
        }
        if (checkForFileCreationSuccess)
            checkForDirectory.append(CLIConstants.CREATE_DIRECTORY_SUCCESS);
        else
            checkForDirectory.append(CLIConstants.CREATE_DIRECTORY_FAILED);

        return checkForDirectory.toString();
    }

}
