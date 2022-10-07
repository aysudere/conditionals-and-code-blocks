
import java.util.Scanner;

public class AdvancedGradeCalculation {
    public static void main(String[] args) {
        /*
        Kullanıcıdan vize 1, vize 2 ve final notunu alarak bir hrf hesaplama sistemi yapmaya çalışın
        ayrıca kullanıcıdan okuldaki genel ortalamasını alarak
        DD alma ve 2.5 altında olma koşuluna göre ekrana bir tavsiye mesajı yazın

        vize1 %30
        vize2 %30
        final %40

        toplam not >= 90 AA
                   >= 85 AB
                   >= 80 BB
                   >= 75 CB
                   >= 70 CC
                   >= 65 DC
                   >= 60 DD
                   >= 55 FD
                   >= 50 FF

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your midterm 1 :");
        int mid1 = scanner.nextInt();

        System.out.println("Please enter your midterm 2 :");
        int mid2 = scanner.nextInt();

        System.out.println("Please enter your final : ");
        int final1 = scanner.nextInt();

        System.out.println("Please enter your school total : ");
        double stotal = scanner.nextDouble();

        double total = (mid1 * 0.3) + (mid2 * 0.3) + (final1 * 0.4);

        if(total >= 90) {
            System.out.println("Your total : AA");
        }
        else if(total >= 85) {
            System.out.println("Your total : BA");
        }
        else if(total >= 80) {
            System.out.println("Your total : BB");
        }
        else if(total >= 75) {
            System.out.println("Your total : CB");
        }
        else if(total >= 70) {
            System.out.println("Your total : CC");
        }
        else if(total >= 65) {
            System.out.println("Your total : DC");
        }
        else if(total >= 60) {
            System.out.println("Your total : DD");

            if(stotal < 2.5) {
                System.out.println("You need work for this lesson");
            }
        }
        else if(total >= 55) {
            System.out.println("Your total : FD");
        }
        else {
            System.out.println("Your total : FF");
        }



    }
}
