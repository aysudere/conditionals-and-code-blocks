import java.util.Scanner;

public class BodyMassIndexConditionals {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan boy ve kilo değerlerine göre
        kitle indeksi hesaplayın ve şu kurallara göre

        bki : kilo / boy * boy
        bki < 18.5 : zayıf
        18.5 < bki < 25 : normal
        25 < bki < 30 : kilolu
        30 < bki :  obez
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight : ");
        int kg = scanner.nextInt();

        System.out.println("Please enter your height : ");
        double m = scanner.nextDouble();

        double bki = ( kg / (m*m));
        System.out.println("Your Body Mass Index : " + bki);

        if(bki <= 18.5) {
            System.out.println("Under Weight");
        }
        else if(18.5 < bki && bki <= 25) {
            System.out.println("Normal Weight");
        }
        else if(25 < bki && bki <= 30) {
            System.out.println("Over Weight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
