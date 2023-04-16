package edu.howardcc.cmsy167.simplemap;

/**
 * This program indexes a file given by the user and allows them to search for words within said file.
 */
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String inputFile, searchTerm;
        int lineCounter = 0;
        Path inputFilePath;
        Pattern regex = Pattern.compile("(\\w+.+\\w)");
        Matcher m;
        Scanner scanner = new Scanner(System.in);
        String[] words;
        SimpleMap<Integer, String> lineMap = new PlaceholderBinaryTreeSimpleMap<>();
        SimpleMap<String, ArrayList<Integer>> indexMap = new PlaceholderBinaryTreeSimpleMap<>();

        System.out.println("Please enter the name of a file: ");
        inputFile = scanner.nextLine();
        inputFilePath = Paths.get(inputFile);

        System.out.printf("\nIndexing %s... \n", inputFile);

        try {
            Scanner inputFileScanner = new Scanner(inputFilePath);

            while(inputFileScanner.hasNextLine()) {
                lineCounter++;

                String currentLine = inputFileScanner.nextLine();
                m = regex.matcher(currentLine);

                if (m.matches()){
                    lineMap.put(lineCounter, currentLine);

                   currentLine = currentLine.toLowerCase();
                   words = currentLine.split("\\s+");

                    for (String word : words) {

                        if (indexMap.get(word) == null) {
                            ArrayList lineNumbers = new ArrayList<String>();
                            lineNumbers.add(lineCounter);
                            indexMap.put(word, lineNumbers);

                        } else {
                            indexMap.get(word).add(lineCounter);
                            indexMap.put(word, indexMap.get(word));

                        }
                    }
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);

        }

        do {
            System.out.print("\nPlease enter a search term(blank to exit):\n");
            searchTerm = scanner.nextLine().toLowerCase();

            if (indexMap.containsKey(searchTerm)) {

                for (Integer lineNum : indexMap.get(searchTerm))
                    System.out.printf("%d: %s\n", lineNum, lineMap.get(lineNum));
                System.out.println();

            } else{
                System.out.printf("\nThis file does not contain \"%s\"", searchTerm);
            }

        } while(!searchTerm.equals(""));

        System.out.print("\nThank you for using this program.");

    }
}