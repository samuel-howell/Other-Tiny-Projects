import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m = sc.nextDouble();
        double p = sc.nextDouble();
        double k = sc.nextInt();


        int year = 0;
        while (m < k) {
            m += (m*(p/100));
            year++;
        }
        System.out.println(year);
    }
}