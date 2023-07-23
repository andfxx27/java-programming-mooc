package andfxx.p11.packages.firstpackages.logic;

import andfxx.p11.packages.firstpackages.ui.UserInterface;

public class ApplicationLogic {
    private final UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Application logic is working");
            ui.update();
        }
    }
}
