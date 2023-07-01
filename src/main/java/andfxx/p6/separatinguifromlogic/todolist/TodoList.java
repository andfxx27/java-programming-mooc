package andfxx.p6.separatinguifromlogic.todolist;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        if (!this.tasks.contains(task)) {
            this.tasks.add(task);
        }
    }

    public void print() {
        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.println(i + 1 + ": " + this.tasks.get(i));
        }
    }

    public void remove(int number) {
        if (number <= this.tasks.size()) {
            this.tasks.remove(number - 1);
        }
    }
}
