import java.util.Scanner;

public class Ortalamahesap {
    public static void main(String[] args) {

        public class Main {
            public static void main(String[] args) {
                // Değişkenler
                int mat, fizik, kimya, turkce, muzik;

                //Scanner Sınıfı tanımladık
                Scanner inp = new Scanner(System.in);

                //Kullanıcıdan değerleri al.
                System.out.println("Matematik Notunuz : ");
                mat = inp.nextInt();

                System.out.println("Fizik Notunuz : ");
                fizik = inp.nextInt();

                System.out.println("Kimya Notunuz : ");
                kimya = inp.nextInt();

                System.out.println("Türkçe Notunuz : ");
                turkce = inp.nextInt();

                System.out.println("Müzik Notunuz : ");
                muzik = inp.nextInt();

                // int - double değerlerini atadık
                int toplam = (mat + fizik + kimya + turkce + muzik);
                double sonuc = toplam / 5;
                //çıktı girildi
                System.out.println("Ortalamanız : " + sonuc);


            }
        }
    }
}