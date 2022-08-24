package duke.command;

import duke.tasklist.TaskList;
import duke.storage.Storage;

/**
 * Represents command to get task on a certain day, or to list out all the tasks.
 */
public class OtherCommand extends Command{
    String fullCommand;

    /**
     * Class constructor. Construct a command for getting or listing tasks.
     * @param fullCommand A string of a line from System.in. Begin with "Get" or "list".
     */
    public OtherCommand(String fullCommand){
        this.fullCommand = fullCommand;
    }

    /**
     * Execute the get or list command. Print out the results.
     * @param taskList The target taskList will be checked or listed.
     * @param storage The object containing the corresponding file.
     */
    @Override
    public void execute(TaskList taskList, Storage storage){
        if (this.fullCommand.split(" ")[0].equals("Get")){
            System.out.println(taskList.getASpecificDay(fullCommand));
        }else{
            System.out.println(taskList.listAllTask());
        }
    }
}
