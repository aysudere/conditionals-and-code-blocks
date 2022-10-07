import java.util.Scanner;

public class FindMaximumValue {
    public static void main(String[] args) {
        //Kullanıcıdan alınan 3 sayıdan maksimumu bulma

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int n1 = scanner.nextInt();

        System.out.println("Please enter second number : ");
        int n2 = scanner.nextInt();

        System.out.println("Please enter third number : ");
        int n3 = scanner.nextInt();

        if(n1 >= n2 && n1 >= n3) {
            System.out.println("Firt number is the biggest! : " + n1);
        }
        else if(n2 >= n1 && n2 >= n3) {
            System.out.println("Second number is the biggest! : " + n2);
        }
        else {
            System.out.println("Third number is the biggest! : " + n3);
        }

        //This is my example

        int max = -1;
        //Javanın sıkıntı vermemesi için -1 verildi

        if (n1 >= n2 && n1 >= n3) {
            max = n1;
        }
        else if(n2 >= n1 && n2 >= n3) {
            max = n2;
        }
        else {
            max = n3;
        }

        System.out.println("Max number is : " + max);


    }
}
