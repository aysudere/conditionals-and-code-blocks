import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        /*
        Switch Case kullanarak 4 işlem yapan hesap makinası
         */

        Scanner scanner = new Scanner(System.in);
        String operations = "1.+" +
                " 2.-" +
                " 3.*" +
                " 4./";
        System.out.println("Operations : " + operations);

        System.out.println("Please enter your operations : ");
        String op1 = scanner.nextLine();

        System.out.println("Number 1 : ");
        int n1 = scanner.nextInt();
        System.out.println("Number 2 : ");
        int n2 = scanner.nextInt();

        double total;

        switch (op1) {
            case "1" :
                total = n1 + n2;
                System.out.println("Total : " + total);
                break;
            case "2" :
                total = n1 - n2;
                System.out.println("Total : " + total);
                break;
            case "3" :
                total = n1 * n2;
                System.out.println("Total : " + total);
                break;
            case "4" :
                total = n1 / n2;
                System.out.println("Total : " + total);
                break;
            default:
                System.out.println("Invalid operations");

        }

    }
}
