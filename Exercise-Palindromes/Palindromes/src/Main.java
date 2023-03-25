
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pattern p = Pattern.compile("([a-zA-Z])");
        String line, character, newLine;
        StringBuilder tempLine = new StringBuilder();
        Matcher m;

        System.out.print("Enter a Sentence: ");
        line = input.nextLine();

        for(int i=0; i<line.length(); i++){
            character = String.valueOf(line.charAt(i));

            m = p.matcher(character);

            if(m.matches()){
                tempLine.append(character.toLowerCase());
            }
        }

        newLine = tempLine.toString();

        if(checkPalindrome(newLine, newLine.length())){
            System.out.printf("\"%s\" is a palindrome", line);
        }else{
            System.out.printf("\"%s\" is not a palindrome", line);
        }

    }

    private static boolean checkPalindrome(String line, int l){

        if(line.charAt(l)==line.charAt(line.length()-l)){

            if(l==0){
                return true;

            }else{
                checkPalindrome(line, l-1);
            }
        }

        return false;
    }
}