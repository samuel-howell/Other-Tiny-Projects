import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String s = sc.next();
            if (s.equals("0")) {
                break;
            } else {
                try {
                    int intS = Integer.parseInt(s);
                    System.out.println(intS * 10);

                } catch (Exception e) {
                    System.out.println("Invalid user input: " + s);
                }
            }
        }

    }
}