import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String kullaniciAdi = "Enes Gulsahin";
        String parola = "160522";
        int girisHakki = 3;
        System.out.println("Sisteme hoşgeldiniz...");
        while (true) {
            System.out.print("Kullanıcı Adı : ");
            kullaniciAdi = inp.nextLine();
            System.out.print("Parola : ");
            parola = inp.nextLine();

            if (kullaniciAdi.equals("Enes Gulsahin") && parola.equals("160522")) {
                System.out.println("Giriş Başarılı");
                break;
            } else if (kullaniciAdi.equals("Enes Gulsahin") && !parola.equals("160522")) {
                System.out.println("Parolanız yanlış, tekrar deneyiniz..");
                girisHakki -= 1;
                System.out.println("Kalan Giriş Hakkı : " + girisHakki);
            } else if (!kullaniciAdi.equals("Enes Gulsahin") && parola.equals("160522")) {
                System.out.println("Kullanıcı adınız yanlış, tekrar deneyiniz..");
                girisHakki -= 1;
                System.out.println("Kalan Giriş Hakkı : " + girisHakki);
            } else {
                System.out.println("Kullaınıcı adınız ve parolanız yanlış");
                girisHakki -= 1;
                System.out.println("Kalan Giriş Hakkı : " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.print("Giriş hakkınız bitti, lütfen daha sonra tekrar deneyiniz..");
                break;
            }


        }
    }
}