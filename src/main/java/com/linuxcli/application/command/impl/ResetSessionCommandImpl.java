/*
 * @Autor Sambuddha Chaudhuri
 * 
 */
package com.linuxcli.application.command.impl;

import com.linuxcli.application.command.ChangeDirectoryCommand;
import com.linuxcli.application.command.ResetSessionCommand;

/**
 * The Class ResetSessionCommandImpl.
 */
public class ResetSessionCommandImpl implements ResetSessionCommand {

    /** The change directory command. */
    ChangeDirectoryCommand changeDirectoryCommand = new ChangeDirectoryCommandImpl();

    /* 
     * Method will reset the session to the Root Directory
     */
    public String resetSessionToRoot(String root) {
        return changeDirectoryCommand.changeDirectoryCommandToRoot(root);
    }
}
