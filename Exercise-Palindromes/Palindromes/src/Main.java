
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pattern p = Pattern.compile("([a-zA-Z])");
        String line, character;
        StringBuilder newLine = new StringBuilder();
        Matcher m;

        System.out.print("Enter a Sentence: ");
        line = input.nextLine();

        for(int i=0; i<line.length(); i++){
            character = String.valueOf(line.charAt(i));

            m = p.matcher(character);

            if(m.matches()){
                newLine.append(character.toLowerCase());
            }
        }

        line = newLine.toString();

        if(checkPalindrome(line)){

        }

        System.out.println(newLine);

    }

    private static boolean checkPalindrome(String newLine){
        return false;
    }
}