import java.util.Scanner;

//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        double d = sc.nextDouble();
//
//        //calculate magnitude
//        double magU = Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2));
//        double magV = Math.sqrt(Math.pow(b, 2) + Math.pow(d, 2));
//
//        //calculate dot product
//        double dot = (a * b) + (c * d);
//
//        double angle = Math.acos(dot / (magU * magV));
//
//        System.out.println(dot);
//        System.out.println(Math.toDegrees(angle));
//    }
//}

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double vX1 = teclado.nextInt();
        double vX2 = teclado.nextInt();
        double vY1 = teclado.nextInt();
        double vY2 = teclado.nextInt();

        double angle = Math.atan2(vX2, vX1) - Math.atan2(vY2, vY1);

        double answer = Math.abs(Math.toDegrees(angle));

        System.out.println(answer);
    }
}