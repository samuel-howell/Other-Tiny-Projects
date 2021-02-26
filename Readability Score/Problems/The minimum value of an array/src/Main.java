import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); //this number will be used to create an array
        int[] intArray = new int[size];
        for (int i = 0; i < intArray.length; i++) {//load the numbers into the array
            intArray[i] = sc.nextInt();
        }
        //sort to find smallest element
        Arrays.sort(intArray);
        int smallestElement = intArray[0];
        System.out.println(smallestElement);
    }
}