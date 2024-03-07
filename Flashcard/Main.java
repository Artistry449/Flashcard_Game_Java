package Flashcard;

import java.util.Scanner;

public class Main {

    App apps[] = new App[4];

    public Main() {
        apps[1] = new Study();
        apps[2] = new Play();
        apps[3] = new Manage();
    }

    public void Menu() {
        System.err.println("\n\n-----FLASHCARD GAME-----\n");
        System.out.println("Flashcard тоглоомд тавтай морил!");
        for (int i = 1; i < apps.length; i++) {
            System.err.println(i + ": " + apps[i].getCaption());
        }

        System.out.println("\n0: Гарах");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int userChoice = 0;

        for (;;) {

            System.out.print("\033[H\033[2J");
            main.Menu();
            System.out.print("\nТаны сонголт: ");
            userChoice = scanner.nextInt();

            if (userChoice == 1) {
                // Study
                main.apps[1].start();
            } else if (userChoice == 2) {
                // Play
                main.apps[2].start();
            } else if (userChoice == 3) {
                // Manage
                main.apps[3].start();
            } else if (userChoice == 0) {
                System.out.println("\nBye Bye!\n");
                break;
            }
        }
    }
}
