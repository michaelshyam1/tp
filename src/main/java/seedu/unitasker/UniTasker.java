package seedu.unitasker;

import java.util.Scanner;

public class UniTasker {
    /**
     * Main entry-point for the java.duke.Duke application.
     */

    UniTasker() {

    }

    public void run() {
        System.out.println("Welcome to UniTasker");
        Scanner in = new Scanner(System.in);
        while (true) {
            String line;
            line = in.nextLine();
            String[] sentence = line.split(" ");
            String commandWord = sentence[0];
            switch (commandWord) {
            case "exit":
                System.out.println("Exiting UniTasker.");
                return;
            case "add":
                break;
            default:
                System.out.println("default echo: " + line);
                break;
            }
        }
    }

    public static void main(String[] args) {
        new UniTasker().run();
    }
}
