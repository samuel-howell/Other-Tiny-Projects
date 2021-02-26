import java.util.*;

//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String[] inputArr = input.split(" ");
//        int[] numArr = new int[inputArr.length];
//
//        for (int i = 0; i < (numArr.length); i++) {
//            int num = Integer.parseInt(inputArr[i]);
//            numArr[i] = num;
//        }
//
//        boolean flag = false;
//        for(int i = 0; i < numArr.length - 2; i++){
//            if (numArr[i] == numArr[i + 1]){ //if number immediately to the right is the same number, then just skip this iteration
//                continue;
//            }
//            else if(numArr[i] > numArr[i + 1]){//descending order
//                flag = true;
//                break;
//            }
//            else{//ascending order
//                flag = false;
//                break;
//            }
//        }
//
//        if (flag == true){
//            for (int i = 1; i < numArr.length-2; i++){ // do numArr.length-2 to avoid checking the zero
//                if(numArr[i] < numArr[i + 1]){
//                    System.out.println("false");
//                    System.exit(1);
//                }
//                else continue;
//            }
//            System.out.println("true");
//
//        }
//        else if (flag == false){
//            for (int i = 1; i < numArr.length-2; i++){
//                if(numArr[i] > numArr[i + 1]){
//                    System.out.println("false");
//                    System.exit(2);
//                }
//                else continue;
//            }
//            System.out.println("true");
//        }
//    }
//}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldNumber = scanner.nextInt();

        if (oldNumber == 0) {
            oldNumber = scanner.nextInt();
        }
        boolean asc = false;
        boolean dec = false;
        int i = 0;
        while (scanner.hasNextInt()) {
            int newNumber = scanner.nextInt();
            if (newNumber == 0) {
                if (i == 0) {
                    System.out.println(true);
                } else  {
                    System.out.println(asc ^ dec);
                }
                break;
            } else if (oldNumber > newNumber) {
                oldNumber = newNumber;
                asc = true;
            } else if (oldNumber < newNumber) {
                oldNumber = newNumber;
                dec = true;
            }
            i++;
        }
    }
}