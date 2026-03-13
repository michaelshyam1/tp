package seedu.duke.tasklist;

import java.util.Comparator;

import seedu.duke.task.Todo;

public class TodoList extends TaskList<Todo> {

    public void setPriority(int index, int priority) {
        tasks.get(index).setPriority(priority);
    }

    public void reorder(int fromIndex, int toIndex) {
        Todo todo = tasks.remove(fromIndex);
        tasks.add(toIndex, todo);
    }

    public void sortByPriority() {
        tasks.sort(Comparator.comparingInt(Todo::getPriority).reversed());
    }

//    public TodoList returnPriorityList() {
//        TodoList priorityList = new TodoList();
//        int numTodos = this.getSize();
//        for (int i = 0; i < numTodos; i += 1) {
//            priorityList.add(this.get(i));
//        }
//        priorityList.sortByPriority();
//        return priorityList;
//    }

    public String toString() {
        String result = "";
        for (int i = 0; i < tasks.size(); i += 1) {
            result = result + (i + 1) + ". " + (tasks.get(i).toString()) + System.lineSeparator();
        }
        return result;
    }

}
