package duke.command;

import duke.tasklist.TaskList;
import duke.dukeexception.DukeException;
import duke.storage.Storage;

/**
 * Represents a command from users.
 */
abstract public class Command {
    private boolean isExit = false;

    /**
     * Execute the command and throws DukeException. Override by its subclass for different execution.
     * @param taskList The target taskList that will be added or deleted task.
     * @param storage The object containing the corresponding file.
     * @throws DukeException Throws exception when errors occur in execution.
     */
    public abstract void execute(TaskList taskList, Storage storage) throws DukeException;
    /**
     * Change the isExit field of the object to true. Means the program will exit.
     */
    public void setIsExitTrue(){
        this.isExit = true;
    }

    /**
     * Returns the instruction about whether the program will end.
     * @return The isExit field of the object, indicating the ending of the program.
     */
    public boolean getIsExit() {
        return this.isExit;
    }
}
