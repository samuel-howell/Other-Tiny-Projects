import java.util.Scanner;

class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                while (sc.hasNextLine()){
                    int userInput = sc.nextInt();

                    if(userInput == 0){
                        break;
                    }

                    if (userInput % 2 == 0) {
                        System.out.println("even");
                    } else {
                        System.out.println("odd");
                    }
                }
            }
        }
