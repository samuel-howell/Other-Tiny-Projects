import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//switch case???
        int num = sc.nextInt();
        int total = 0;
        System.out.print(num + " ");

        if (num != 1) {
            do {
                while (num % 2 != 0) {
                    num = (num * 3) + 1;
                    System.out.print(num + " ");
                }
                if (num % 2 == 0) {
                    num = (num / 2);
                    System.out.print(num + " ");
                }
            } while (num != 1);
        }
    }
}