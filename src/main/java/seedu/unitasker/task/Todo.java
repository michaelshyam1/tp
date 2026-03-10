package seedu.unitasker.task;

public class Todo extends Task{
    protected int priority;

    public Todo(String description) {
        super(description);
        this.priority = 0;
    }

    public Todo(String description, int priority) {
        super(description);
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String toString() {
        return "[" + getStatusIcon() + "] " + getDescription();
    }
}
