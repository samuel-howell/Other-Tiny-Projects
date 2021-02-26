import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        String firstThree = num.substring(0, 3);
        String lastThree = num.substring(3);

        String[] arr1 = firstThree.split("");
        String[] arr2 = lastThree.split("");

        int total1 = 0;
        int total2 = 0;

        for(int i = 0; i < firstThree.length(); i++){
            total1 += Integer.parseInt(arr1[i]);
        }

        for(int i = 0; i < firstThree.length(); i++){
            total2 += Integer.parseInt(arr2[i]);
        }

        if(total1 == total2) System.out.println("Lucky");
        else System.out.println("Regular");
    }
}