package by.verabei;

import by.verabei.builder.FileSystemBuilder;
import by.verabei.filesystem.Folder;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Folder rootFolder = new Folder("root");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path to add\n" +
                "Or enter print to print out tree structure\n" +
                "Or enter quit to stop the program");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.equals("quit")) {
                break;
            } else if (line.equals("print")) {
                rootFolder.display(0);
            } else {
                FileSystemBuilder.buildFileSystem(line, rootFolder);
            }
        }
    }
}
