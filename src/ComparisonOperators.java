public class ComparisonOperators {
    public static void main(String[] args) {
        /*
        Karşılaştırma operatörleri

        true: koşul sağlandı
        false: koşul sağlanmadı

        karşılaştırma op : iki tane variables'i karşılaştırmamızı sağlar
                            dönen değer true yada false olarak döner

        == eşit mi
        != eşit değil mi
        > büyük mü
        >= büyük veya eşit mi
        < küçük mü
        <= küçük veya eşit mi

         */

        System.out.println(3 == 3);
        //3, 3'e eşit mi

        System.out.println(4 == 3);
        //4, 3'e eşit mi

        System.out.println(3 != 4);
        //3, 4'e eşit değil

        System.out.println(3 != 3);
        //3, 3'e eşit değil

        System.out.println(2 > 3);
        //2, 3'ten büyük

        System.out.println(2 > 1);
        //2, 1'den büyük

        System.out.println(2 >= 1);
        //2, 1'den büyük yada eşit

        System.out.println(2 >= 2);
        //2, 2'den büyük veya eşit

        System.out.println(2 >= 3);
        //2, 3'ten büyük veya eşit

        System.out.println(2 < 3);
        //2, 3'ten küçük

        System.out.println(2 < 1);
        //2, 1'den küçük

        System.out.println(2 <= 3);
        //2, 3'ten küçük veya eşit mi

        System.out.println(2 <= 2);
        //2, 2'den küçük veya eşit mi

        /*
        karşılaştırma operatörleriyle, iki adet stringte kontrol edilebilir
         */

        System.out.println("Mehmet" == "Mehmet");
        System.out.println("Mehmet" != "Mehmet");
        //Ancak büyüktür küçüktür karşılaştırması yapılamaz
    }
}
