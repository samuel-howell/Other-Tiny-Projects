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
        int timesOfRotation = 1;
        for(int i = 0; i < timesOfRotation; i++){
            int firstNum = intArray[size-1]; //last number in array, which will go first
            int j;
            for(j = intArray.length-1; j > 0; j--){
                intArray[j] = intArray[j-1];
            }
            intArray[0] = firstNum;
        }
        //print out cycled array
        for(int i = 0; i< intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }
}