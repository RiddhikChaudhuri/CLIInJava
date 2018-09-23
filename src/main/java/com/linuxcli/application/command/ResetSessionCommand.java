/*
 * @author Sambuddha Chaudhuri
 */
package com.linuxcli.application.command;

/**
 * The Interface ResetSessionCommand.
 */
public interface ResetSessionCommand {
	
	/**
	 * Reset session to root.
	 *
	 * @param root the root
	 * @return the string
	 */
	public String resetSessionToRoot(String root);

}
