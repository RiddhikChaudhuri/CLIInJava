/*
 * @author Sambuddha Chaudhuri
 */
package com.linuxcli.apllication.constant;


/**
 * The Class CLIConstants.
 */
public final class CLIConstants {

    /**
     * Instantiates a new CLI constants.
     */
    private CLIConstants() {

    }

    /** The Constant WRONG_INPUT_FROM_USER. */
    public static final String WRONG_INPUT_FROM_USER = "ERR: CANNOT RECOGNIZE INPUT.";
    
    /** The Constant APPLICATION_STARTUP_MESSAGE. */
    public static final String APPLICATION_STARTUP_MESSAGE = "Application Started ....";
    
    /** The Constant GET_USER_DIR. */
    public static final String GET_USER_DIR = "user.dir";
    
    /** The Constant GET_START_OF_COMMAND. */
    public static final String GET_START_OF_COMMAND = "$>  ";
    
    /** The Constant GET_DELIMITER_FOR_SPLIT. */
    public static final String GET_DELIMITER_FOR_SPLIT = "\\s+";
    
    /** The Constant GET_CURRENT_DIRECTORY. */
    public static final String GET_CURRENT_DIRECTORY = "pwd";
    
    /** The Constant GET_LIST_OF_FILES. */
    public static final String GET_LIST_OF_FILES = "ls";
    
    /** The Constant CREATE_NEW_DIRECTORY. */
    public static final String CREATE_NEW_DIRECTORY = "mkdir";
    
    /** The Constant REMOVE_DIRECTORY. */
    public static final String REMOVE_DIRECTORY = "rm";
    
    /** The Constant CHANGE_HOME_DIRECTORY. */
    public static final String CHANGE_HOME_DIRECTORY = "cd";
    
    /** The Constant COMMAND_LINE_SESSION. */
    public static final String COMMAND_LINE_SESSION = "session";
    
    /** The Constant CLEAR. */
    public static final String CLEAR = "clear";
    
    /** The Constant RESET_TO_FOLDER_SUCCESS. */
    public static final String RESET_TO_FOLDER_SUCCESS = "SUCC: CLEARED: RESET TO ROOT";
    
    /** The Constant CHANGE_DIRECTORY_SUCCESS. */
    public static final String CHANGE_DIRECTORY_SUCCESS = "SUCC: REACHED";
    
    /** The Constant CREATE_DIRECTORY_SUCCESS. */
    public static final String CREATE_DIRECTORY_SUCCESS = "SUCC: CREATED";
    
    /** The Constant CREATE_DIRECTORY_FAILED. */
    public static final String CREATE_DIRECTORY_FAILED = "ERR: DIRECTORY ALREADY EXISTS";
    
    /** The Constant CHANGE_DIRECTORY_FAILED. */
    public static final String CHANGE_DIRECTORY_FAILED = "ERR: INVALID PATH";
    
    /** The Constant PATH. */
    public static final String PATH = "PATH: ";
    
    /** The Constant GET_LIST_FAILURE. */
    public static final String GET_LIST_FAILURE = "No directory/File exists";
    
    /** The Constant GET_DIRECTORY_LIST. */
    public static final String GET_DIRECTORY_LIST = "DIRS: ";
    
    /** The Constant REMOVE_DIRECTORY_SUCCESS. */
    public static final String REMOVE_DIRECTORY_SUCCESS = "SUCC: DELETED";
    
    /** The Constant REMOVE_DIRECTORY_NOT_EXISTS. */
    public static final String REMOVE_DIRECTORY_NOT_EXISTS = "ERR: DIRECTORY DOESN'T EXISTS";
}
