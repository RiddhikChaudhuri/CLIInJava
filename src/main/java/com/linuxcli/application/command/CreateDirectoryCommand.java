/*
 * @author Sambuddha Chaudhuri
 */
package com.linuxcli.application.command;


/**
 * The Interface CreateDirectoryCommand.
 */
public interface CreateDirectoryCommand {
	
	/**
	 * Creates the directory.
	 *
	 * @param directoryNames the directory names
	 * @return the string
	 */
	public String createDirectory(String[] directoryNames);
	
}
