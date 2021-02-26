import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfElements = sc.nextInt();
        int[] array = new int[numOfElements];

//        for(int i = 0; i < array.length; i++){
//            int randomInt = (int)(10 * Math.random());
//            array[i] = (randomInt);
//        }
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        //walk backwards through the array, checking if numbers are divisible to 4
        for(int i = array.length-1; i > 0; i--){
            if(array[i] % 4 == 0){
                System.out.println(array[i]);
                break;
            }
        }
    }
}