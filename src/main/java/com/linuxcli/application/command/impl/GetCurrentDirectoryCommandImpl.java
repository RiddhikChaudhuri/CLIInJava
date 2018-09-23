/*
 * @author Sambuddha Chaudhuri
 * 
 */
package com.linuxcli.application.command.impl;

import com.linuxcli.apllication.constant.CLIConstants;
import com.linuxcli.application.command.GetCurrentDirectoryCommand;

/**
 * The Class GetCurrentDirectoryCommandImpl.
 */
public class GetCurrentDirectoryCommandImpl implements GetCurrentDirectoryCommand {

    /* Getting the Current Directory
     */
    public String getCurrentDirectory() {
        return CLIConstants.PATH + System.getProperty(CLIConstants.GET_USER_DIR);

    }

}
