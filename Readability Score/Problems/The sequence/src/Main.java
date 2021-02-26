import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int counter = 0;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                if (counter == num){
                    break;
                }
                System.out.print(i + " ");
                counter++;
            }
        }
    }
}
