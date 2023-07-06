package andfxx.p8.recap.todolist;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String todo) {
        if (!this.todoList.contains(todo)) {
            this.todoList.add(todo);
        }
    }

    public void print() {
        for (int i = 0; i < this.todoList.size(); i++) {
            System.out.println((i + 1) + ": " + this.todoList.get(i));
        }
    }

    public void remove(int number) {
        if (number <= this.todoList.size()) {
            this.todoList.remove(number - 1);
        }
    }
}
