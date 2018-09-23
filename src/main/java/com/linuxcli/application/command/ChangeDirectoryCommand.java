/*
 * @author Sambuddha Chaudhuri
 */
package com.linuxcli.application.command;

/**
 * The Interface ChangeDirectoryCommand.
 */
public interface ChangeDirectoryCommand {

	/**
	 * Change directory command.
	 *
	 * @param filePath the file path
	 * @return the string
	 */
	public String changeDirectoryCommand(String filePath);

	/**
	 * Change directory command to root.
	 *
	 * @param root the root
	 * @return the string
	 */
	public String changeDirectoryCommandToRoot(String root);
	
	/**
	 * Change directory command to previous folder.
	 *
	 * @param filePath the file path
	 */
	public void changeDirectoryCommandToPreviousFolder(String filePath) ;
}
