import java.util.Scanner;

public class ConditionalStates {
    public static void main(String[] args) {
        /*
        if(kosul) {
                    koşul sağlandığında(true) bu blok çalışır
        else {
                    bu bloğun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışır

        koşullar, koşul bloklarıyla sağlanır
        koşul sağlandığında bloklar çalışmaktadır
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age : ");
        int age = scanner.nextInt();

        if(age < 18) {
            System.out.println("You can not enter this bar");
        }

        System.out.print("Please enter a number : ");
        int number = scanner.nextInt();
        if(number < 0) {
            System.out.println("This number is negative");
        }
        else {
            System.out.println("This number is zero or positive");
        }
        /*
        Koşul sağlanmadığında, else bloğu çalışmaktadır.
        else, if olmadan çalışmaz
         */
    }
}
