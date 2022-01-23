import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, muzik, k =0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik Notunuz :");
        mat = inp.nextInt();
        System.out.println("Türkçe Notunuz :");
        turkce = inp.nextInt();
        System.out.println("Fizik Notunuz :");
        fizik = inp.nextInt();
        System.out.println("Kimya Notunuz :");
        kimya = inp.nextInt();
        System.out.println("Muzik Notunuz :");
        muzik = inp.nextInt();

        if (0 <= mat && 100 >= mat){
            k++;
        }else{
            mat =0;
        }
        if (0 <= turkce && 100 >= turkce){
            k++;
        }else{
            turkce =0;
        }
        if (0 <= fizik && 100 >= fizik){
            k++;
        }else{
            fizik =0;
        }
        if (0 <= kimya && 100 >= kimya){
            k++;
        }else{
            kimya =0;
        }
        if (0 <= muzik && 100 >= muzik){
            k++;
        }else{
            muzik =0;
        }
            double  ortalama = (mat + turkce + fizik + kimya + muzik) / k;
        if (ortalama >= 55){
            System.out.println("Geçtiniz");
        } else {
            System.out.println("Kaldınız");
        }
        System.out.print("Ortalamanız : " + ortalama);
    }
}
