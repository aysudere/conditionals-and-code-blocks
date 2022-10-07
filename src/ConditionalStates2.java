import java.util.Scanner;

public class ConditionalStates2 {
    public static void main(String[] args) {
        /*
        if (koşul) {

        else if (koşul) {

        else if (koşul) {

        else {

        bir tane değişken, birden fazla değişkene bağlı olabilmektedir
        -kullanıcıdan alınan işlem değeri, geçersiz işlem için else kullanılırken diğer koşullar else if ile
        sağlanabilmektedir

        -istediğimiz kadar else if(başka bir koşul olmak kaydıyla) kullanılabilmektedir.

         */

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Please select your operation : " +
                "1.sum " +
                "2.sub " +
                "3.imp " +
                "4.div ");

        int operation = scanner.nextInt();

        if(operation == 1) {
            System.out.println("First operation : ");
        }
        else if(operation == 2) {
            System.out.println("Second operation : ");
        }
        else if(operation == 3) {
            System.out.println("Third operation : ");
        }
        else if(operation == 4) {
            System.out.println("Fourth operation : ");
        }
        else {
            System.out.println("Invalid operation..");
        } */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select your score : ");

        int score = scanner.nextInt();

        if(score >= 90) {
            System.out.println("AA");
        }
        else if(score >= 85) {
            System.out.println("BA");
        }
        else if(score >= 80) {
            System.out.println("BB");
        }
        else if(score >= 75) {
            System.out.println("CB");
        }
        else if(score >= 70) {
            System.out.println("CC");
        }
        else if(score >= 65) {
            System.out.println("DC");
        }
        else if(score >= 60) {
            System.out.println("DD");
        }
        else {
            System.out.println("You failed the exam");
        }

        /*
        else if ile if'in farkı
        -if, yukarda koşulun sağlanıp sağlanmadığına bakmaz
        if diğer koşulların çalışıp çalışmadığına bakmaz
        sağlanan her if bloğu çalışır

        else if, koşul sağlansa bile, yukardaki if bloğu çalışırsa  çalışmaz.
         */
    }
}
