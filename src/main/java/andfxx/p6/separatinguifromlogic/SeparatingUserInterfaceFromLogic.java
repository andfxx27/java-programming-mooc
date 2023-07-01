package andfxx.p6.separatinguifromlogic;

import andfxx.p6.separatinguifromlogic.graderegister.GradeRegister;
import andfxx.p6.separatinguifromlogic.graderegister.GradeRegisterTextUi;
import andfxx.p6.separatinguifromlogic.jokemanager.JokeManager;
import andfxx.p6.separatinguifromlogic.jokemanager.JokeManagerTextUi;
import andfxx.p6.separatinguifromlogic.simpledictionary.SimpleDictionary;
import andfxx.p6.separatinguifromlogic.simpledictionary.SimpleDictionaryTextUi;
import andfxx.p6.separatinguifromlogic.todolist.TodoList;
import andfxx.p6.separatinguifromlogic.todolist.TodoListTextUi;

import java.util.Scanner;

public class SeparatingUserInterfaceFromLogic {
    public static void separatingUserInterfaceFromLogic() {
        System.out.println("Hello world from andfxx.p6.separatinguifromlogic");

        jokeManager();
    }

    private static void jokeManager() {
        Scanner scanner = new Scanner(System.in);
        JokeManager jokeManager = new JokeManager();
        JokeManagerTextUi jokeManagerTextUi = new JokeManagerTextUi(scanner, jokeManager);

        jokeManagerTextUi.start();
    }

    private static void average() {
        Scanner scanner = new Scanner(System.in);
        GradeRegister gradeRegister = new GradeRegister();
        GradeRegisterTextUi gradeRegisterTextUi = new GradeRegisterTextUi(scanner, gradeRegister);

        gradeRegisterTextUi.start();
    }

    private static void todoList() {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        TodoListTextUi todoListTextUi = new TodoListTextUi(scanner, todoList);

        todoListTextUi.start();
    }

    private static void simpleDictionary() {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary simpleDictionary = new SimpleDictionary();
        SimpleDictionaryTextUi simpleDictionaryTextUi = new SimpleDictionaryTextUi(scanner, simpleDictionary);

        simpleDictionaryTextUi.start();
    }
}
