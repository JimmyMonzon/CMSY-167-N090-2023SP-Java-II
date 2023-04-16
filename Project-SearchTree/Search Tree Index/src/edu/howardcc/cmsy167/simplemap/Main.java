package edu.howardcc.cmsy167.simplemap;

/**
 * This program indexes a file given by the user and allows them to search for words within said file.
 */
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String inputFile;
        Path inputFilePath;
        Pattern regex = Pattern.compile("\\w+.+\\w");
        Matcher m;
        Scanner scanner = new Scanner(System.in);
        SimpleMap indexMap = new PlaceholderBinaryTreeSimpleMap<>();

        System.out.println("Please enter the name of a file: ");
        inputFile = scanner.nextLine();
        inputFilePath = Paths.get(inputFile);

        System.out.printf("Indexing %s... ", inputFile);

        try {
            Scanner inputFileScanner = new Scanner(inputFilePath);

            while(inputFileScanner.hasNextLine()) {

                String currentLine = inputFileScanner.nextLine();
                m = regex.matcher(currentLine);

                if (m.matches()){

                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);

        }


    }
}