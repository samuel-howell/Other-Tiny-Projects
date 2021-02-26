import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        switch (ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'u' :
            case 'U' :
                return true;
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}