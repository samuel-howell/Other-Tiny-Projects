import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int accumulator = 1;
        long total = a;
        for(int i = a; i < b-1; i++) {
            //100*101*102*103*104
            total = total * (i+1);

        }
        System.out.println(total);

    }
}