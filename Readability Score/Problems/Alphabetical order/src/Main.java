import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String[] strArr = userInput.split(" ");


        boolean sorted = true;
        for(int i = 0; i < strArr.length; i++)
        {
            for(int j = i+1; j < strArr.length; j++)
            {
                if (strArr[i].compareTo(strArr[j]) > 0)
                {
                    sorted = false;
                }
            }
        }
        System.out.println(sorted);
    }
}