package seedu.unitasker.tasklist;

import java.util.Comparator;

import seedu.unitasker.task.Todo;

public class TodoList extends TaskList<Todo> {

    public void reorder(int fromIndex, int toIndex) {
        Todo todo = tasks.remove(fromIndex);
        tasks.add(toIndex, todo);
    }

    public void sortByPriority() {
        tasks.sort(Comparator.comparingInt(Todo::getPriority));
    }
}