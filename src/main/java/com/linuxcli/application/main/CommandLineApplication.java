package com.linuxcli.application.main;

import java.util.Scanner;

import com.linuxcli.apllication.constant.CLIConstants;
import com.linuxcli.application.command.ChangeDirectoryCommand;
import com.linuxcli.application.command.CreateDirectoryCommand;
import com.linuxcli.application.command.GetCurrentDirectoryCommand;
import com.linuxcli.application.command.GetListDirectoryCommand;
import com.linuxcli.application.command.RemoveDirectoryCommand;
import com.linuxcli.application.command.ResetSessionCommand;
import com.linuxcli.application.command.impl.ChangeDirectoryCommandImpl;
import com.linuxcli.application.command.impl.CreateDirectoryCommandImpl;
import com.linuxcli.application.command.impl.GetCurrentDirectoryCommandImpl;
import com.linuxcli.application.command.impl.GetListOfDirectoryCommandImpl;
import com.linuxcli.application.command.impl.RemoveDirectoryCommandImpl;
import com.linuxcli.application.command.impl.ResetSessionCommandImpl;


/**
 * The Class CommandLineApplication.
 */
public class CommandLineApplication {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        CommandLineApplication commandLineApplicationObject = new CommandLineApplication();
        System.out.println(CLIConstants.APPLICATION_STARTUP_MESSAGE);
        final String sessionVariable = System.getProperty(CLIConstants.GET_USER_DIR);
        commandLineApplicationObject.waitMethod(sessionVariable);
    }

    /**
     * Wait method.This method is used so as to make the porgram as long as user wants to
     *
     * @param sessionVariable the session variable
     */
    private synchronized void waitMethod(String sessionVariable) {
        while (true) {
            GetCurrentDirectoryCommand getCurrentDirectorycommand = new GetCurrentDirectoryCommandImpl();
            GetListDirectoryCommand getListDirectorycommand = new GetListOfDirectoryCommandImpl();
            CreateDirectoryCommand createNewDirectoryCommand = new CreateDirectoryCommandImpl();
            RemoveDirectoryCommand removeDirectory = new RemoveDirectoryCommandImpl();
            ChangeDirectoryCommand changeDirectory = new ChangeDirectoryCommandImpl();
            ResetSessionCommand resetSessionCommand = new ResetSessionCommandImpl();
            System.out.print(CLIConstants.GET_START_OF_COMMAND);
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] splited = input.trim().split(CLIConstants.GET_DELIMITER_FOR_SPLIT);
            switch (splited[0]) {
            case CLIConstants.GET_LIST_OF_FILES:
                System.out.println(getListDirectorycommand.getListOfDirectories());
                break;
            case CLIConstants.GET_CURRENT_DIRECTORY:
                System.out.println(getCurrentDirectorycommand.getCurrentDirectory());
                break;
            case CLIConstants.CREATE_NEW_DIRECTORY:
                System.out.println(createNewDirectoryCommand.createDirectory(splited));
                break;
            case CLIConstants.REMOVE_DIRECTORY:
                System.out.println(removeDirectory.removeDirectory(splited));
                break;
            case CLIConstants.CHANGE_HOME_DIRECTORY:
                System.out.println(changeDirectory.changeDirectoryCommand(splited[1]));
                break;
            case CLIConstants.COMMAND_LINE_SESSION:
                if (splited[1].equals(CLIConstants.CLEAR)) {
                    System.out.println(resetSessionCommand.resetSessionToRoot(sessionVariable));
                    break;
                }
            default:
                System.out.println(CLIConstants.WRONG_INPUT_FROM_USER);
                break;
            }

        }

    }

}
