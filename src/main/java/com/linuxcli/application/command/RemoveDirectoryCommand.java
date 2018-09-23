/*
 * @author Sambuddha Chaudhuri
 */
package com.linuxcli.application.command;


/**
 * The Interface RemoveDirectoryCommand.
 */
public interface RemoveDirectoryCommand {

    /**
     * Removes the directory.
     *
     * @param directoryList the directory list
     * @return the string
     */
    public String removeDirectory(String[] directoryList);

}
