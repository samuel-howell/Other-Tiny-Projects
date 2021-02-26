import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String match = "burg";
        String input = sc.nextLine();

        if (input.endsWith(match)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}