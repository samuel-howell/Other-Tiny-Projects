import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String finalStr = "";
        int sum = 1;

        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i + 1)){
                sum++;
            }
            else {
                finalStr = finalStr + str.charAt(i) + sum;
                sum =1;
            }
        }
        finalStr = finalStr + str.charAt(str.length()-1) + sum;
        System.out.println(finalStr);
    }
}