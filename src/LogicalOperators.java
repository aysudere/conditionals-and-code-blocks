public class LogicalOperators {
    public static void main(String[] args) {
        /*
        Mantıksal operatörler

        && : and operatörü
             0 0 : 0
             0 1 : 0
             1 0 : 0
             1 1 : 1
         Bütün karşılaştırma değerleri true ise: true
         en az biri false ise : false

        || : veya operatörü
            0 0 : 0
            0 1 : 1
            1 0 : 1
            1 1 : 1
         en az birinin true olması : true

         ! :not operatörü
         true'yu false'a
         false'u true'ya
         */

        System.out.println(3 == 3);
        System.out.println(2 < 3);
        System.out.println("murat" == "murat");

        System.out.println(3 == 3 && 2 < 3); // true and true
        System.out.println(3 == 3 && 2 > 3 );


        System.out.println(3 == 3 && 2 > 3 && "murat" == "murat");
        System.out.println(3 == 3 && 2 < 3 && "aysu" == "aysu");

        System.out.println(3 == 3 || 2 < 3 || "ay" == "ay");
        System.out.println(3 == 3 || 2 > 3 || "ay" == "ay");
        System.out.println(3 != 3 || 2 > 3 || "ay" != "ay");

        System.out.println(!false);
        System.out.println(!true);

        System.out.println(!(3 < 4));
        //syntax hatası almamak için parantez kullanmak en mantıklısıdır

        /*
        hangi işlem daha öncelikliyse, paranteze alınmalıdır
         */

        System.out.println(!((3 < 4 && "ay" == "ay") || 3.4 > 2.1 ));

    }
}
