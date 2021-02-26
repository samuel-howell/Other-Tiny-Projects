//import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCompanies = sc.nextInt();

        int[] yrIncomeArr = new int[numOfCompanies];
        double[] taxPercentArr = new double[numOfCompanies];
        double[] taxAmount = new double[numOfCompanies];

        for (int i = 0; i < yrIncomeArr.length; i++) {
            yrIncomeArr[i] = sc.nextInt();
        }
        for (int i = 0; i < taxPercentArr.length; i++) {
            taxPercentArr[i] = sc.nextInt() / 100.0;
        }

        //calculate taxes for each company
        for (int i = 0; i < yrIncomeArr.length; i++) {
            if (yrIncomeArr[i] == 0.0){ //zeroes as incomes
                taxAmount[i] = 0.0;
                continue;
            }
            if (taxPercentArr[i] == 0.0) {//zeroes as percents
                taxAmount[i] = 0.0;
                continue;
            }

            taxAmount[i] = (yrIncomeArr[i] * taxPercentArr[i]);
        }
        //System.out.println(Arrays.toString(taxAmount));
        // Some variable declarations here
        double smallest = Integer.MAX_VALUE;
        double largest = 0;
        int occurrences = 0;
        int k = 0;
        // This for-loop find the highest amount in taxAmount and its index
        for (int i = 0; i < taxAmount.length; i++) {
            if (largest < taxAmount[i]) {
                largest = taxAmount[i];
                k = i;
            }
        }
        // This for-loop iterate over taxAmount again to see if there are more than 1 occurrences of the largest element
        for (int i = 0; i < taxAmount.length; i++) {
            if (largest == taxAmount[i])
                occurrences++;
        }
        // If there are more than 1 occurrences, then find the smallest amount in taxAmount and its index in the array
        if (occurrences > 1) {
            for (int i = 0; i < taxAmount.length; i++) {
                if (smallest > taxAmount[i]) {
                    smallest = taxAmount[i];
                    k = i;
                }
            }
        }
        // Print the result of the index plus one (1)
        System.out.println(k + 1);
    }
}
