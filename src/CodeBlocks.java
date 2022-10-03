public class CodeBlocks {

    /*
    Fonksiyonlarda
    koşullu durumlarda
    döngülerde kullandığımız kod blokları
    süslü parentez ile gösterilir.

    kod bluğu dışındaki kodlar, bloğa özgü değildir.

     */

    public static void main(String[] args) {

        int a           =       5;
        int b
                =
                3;

        System.out.println(a);
        System.out.println(b);
        //Belirli koşullar için kod blokları kullanılır


        int c = 5;double d = 5d;float e = 4.2f;
        /*
        int c =       5;double d      =       5d;float e       =      4.2f;
        int c = 5;
                        double d = 5d;
                                           float e = 4.2f;
         */

        System.out.println("c : " + c + " d : " + d + " e : " + e);


        int km = 5; //kaç km gittiği
        double price = 0.25d; //km başına yaktığı miktar
        System.out.println("Price : " + km*price);


    }

    //kob bloğu içine yazılan değerler, o class'a özgüdür
}

    /*
    Temiz kod yazmak :

    clean, düzgün bir şekilde yazmak diğer çalışma arkadaşları için de uygun olacaktır

    java : esnek bir dildir
    int a = 5;
    ile
    int a                           =                   5;
    aynı anlama gelmektedir
     */
