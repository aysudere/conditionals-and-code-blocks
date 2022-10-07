import java.util.Scanner;

public class SwitchCaseStructures {
    public static void main(String[] args) {
        /*
        swithc(op) {
            case durum1 :
                islemler
                break
            case durum2 :
                islemler
                break
            default :
                islemler
                break

         nasıl kullanılır
         op : değişkeninin değerine göre caselerin içerisine girmektedir
         kaç durum varsa ona göre durumlara girebiliriz

         defaultt : if-else durumlarındaki else'e denk gelmektedir
         break : case'e girdikten sonra başka bir case'e girmek istemiyorsak break kullanabiliriz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your operation : ");

        int operation = scanner.nextInt();

        switch (operation) {
            case 1 :
                System.out.println("First operation");
                break;
            case 2 :
                System.out.println("Second operation");
                break;
            case 3 :
                System.out.println("Third operation");
                break;
            case 4 :
                System.out.println("Fourth operation");
                break;
            default:
                System.out.println("Invalid operation ");
                break;
        }
    }
    /*
    caseler sağlandığı değere girer ve break ile çıkar

    -ilk doğru olan case'e girdiği takdirde, karşılasa da karşılasamada o değeri okumaktadır
    bu yüzden break yapısını kullanmak zorunludur

    eğer 2. değerden kaldırırsak, 3.değerde break olmasa bile break gördüğü yerde durmaktadır

    belirli bir case'e girdikten sonra direkt olarak çıkmasını isterseniz : break kullanılabilir.
     */
}
