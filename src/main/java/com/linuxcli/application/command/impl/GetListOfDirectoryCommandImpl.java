/*
 * @autor Sambuddha Chaudhuri
 */
package com.linuxcli.application.command.impl;

import java.io.File;

import com.linuxcli.apllication.constant.CLIConstants;
import com.linuxcli.application.command.GetListDirectoryCommand;

/**
 * The Class GetListOfDirectoryCommandImpl.
 */
public class GetListOfDirectoryCommandImpl implements GetListDirectoryCommand {

    /* 
     * Getting the List of Directories present inside the folder
     */
    public String getListOfDirectories() {
        File dir = new File(System.getProperty(CLIConstants.GET_USER_DIR));
        StringBuilder getListOFDirectory = new StringBuilder();
        /* Function called to get the List of Files in the Directory
         * using this command.
         */
        String childs[] = dir.list();
        if (childs.length == 0) {
            getListOFDirectory.append(CLIConstants.GET_LIST_FAILURE);
        } else {
            getListOFDirectory.append(CLIConstants.GET_DIRECTORY_LIST);
            for (String directory : childs) {
                getListOFDirectory.append(directory);
                getListOFDirectory.append(" ");
            }
        }
        return getListOFDirectory.toString();
    }

}
