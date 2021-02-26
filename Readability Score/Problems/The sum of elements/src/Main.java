import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int elem;
        int sum = 0;
        do{
            elem = sc.nextInt();
            sum += elem;
        } while(elem != 0);

        System.out.println(sum);
    }
}