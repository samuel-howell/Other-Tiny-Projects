import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < 4; i++){
            arr[i] = arr[i] - 1;
        }
        for(int i = 0; i < 4; i++){
            System.out.print(arr[i] + " ");
        }
    }
}