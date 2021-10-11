import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,changePassword;


        Scanner input=new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName=input.nextLine();
        System.out.print("Şifreniz : ");
        password=input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Girilen bilgiler yanlış!");
            System.out.print("Şifrenizi sıfırlamak için 'e' basınız : ");
            changePassword=input.nextLine();
            if(changePassword.equals("e")) {
                System.out.print("Yeni şifre : ");
                password = input.nextLine();
                if (password.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            else{
                System.out.println("Sistemden çıkılıyor.");
            }
        }

    }
}
