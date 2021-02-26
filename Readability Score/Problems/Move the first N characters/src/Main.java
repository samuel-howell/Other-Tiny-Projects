import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();
        if (n >= str.length() || n < 0) {
            System.out.println(str);
            System.exit(0);
        } else {
            String str1 = str.substring(0, n);
            String str2 = str.substring(n);

            System.out.println(str2 + str1);
        }
    }
}
