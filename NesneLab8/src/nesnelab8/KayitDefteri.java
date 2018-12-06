


//kayit ekleme, kayit silme,mail güncelleme,yazdirma,siralama
package nesnelab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class KayitDefteri {
    
    static Scanner scan = new Scanner(System.in);
    private ArrayList<String> isim = new ArrayList<>();
    private ArrayList<String> soyIsim = new ArrayList<>();
    private ArrayList<String> telefon = new ArrayList<>();
    private ArrayList<String> mail = new ArrayList<>();
    String temp;
    int index;
    void kayitEkleme(){
        
        System.out.print("\nİsim giriniz:");
        temp = scan.nextLine();
        isim.add(temp);
        System.out.print("Soyisim giriniz:");
        temp = scan.nextLine();
        soyIsim.add(temp);
        System.out.print("E-mail giriniz:");
        temp = scan.nextLine();
        mail.add(temp);
        System.out.print("Tel no giriniz:");
        temp = scan.nextLine();
        telefon.add(temp);
        
        
    }
    
    void kayitSilme(){
        
        System.out.print("\nSilnecek kaydin ismini giriniz:");
        temp = scan.nextLine();
        index = isim.indexOf(temp);
        isim.remove(index);
        soyIsim.remove(index);
        telefon.remove(index);
        mail.remove(index);
        
    }
    
    void mailGuncel(){
        
        System.out.println("\nMailinin guncellenmesini istediginiz ismi giriniz:");
        temp = scan.nextLine();
        index = isim.indexOf(temp);
        System.out.print("Yeni E-mail'i giriniz:");
        temp = scan.nextLine();
        mail.set(index, temp);
        
    }
    
    void yazdirma(){
        System.out.print("Yazdirlicak kaydin ismini giriniz:");
        temp = scan.nextLine();
        index = isim.indexOf(temp);
        System.out.println("\nİsim: " + isim.get(index));
        System.out.println("Soyisim: " + soyIsim.get(index));
        System.out.println("Mail: " + mail.get(index));
        System.out.println("Telefon no: " + telefon.get(index)+"\n\n");
    }
    
    
    void siralama(){
        int index;
        System.out.println("İsme gore siralama icin 1'e\n"
                + "Soyisme gore siralama icin 2'e\n"
                + "Mail gore siralama icin 3'e\n"
                + "Telefona gore siralama icin 4'e \n");
        int secim = scan.nextInt();
        switch(secim){
            
            case 1:
                Collections.sort(isim);
                 
                for(String isim1 : isim){
                    System.out.print("\nİsim: " + isim1);
                    index = isim.indexOf(isim1);
                    System.out.println("Soyisim: " + soyIsim.get(index));
                    System.out.println("Mail: " + mail.get(index));
                    System.out.println("Telefon no: " + telefon.get(index)+"\n\n");
                }
                break;
            case 2:
                Collections.sort(soyIsim);
                for(String soyisim1 : soyIsim){
                    
                    index = soyIsim.indexOf(soyisim1);
                    System.out.print("\nİsim: " + isim.get(index));
                    System.out.println("Soyisim: " + soyIsim.get(index));
                    System.out.println("Mail: " + mail.get(index));
                    System.out.println("Telefon no: " + telefon.get(index)+"\n\n");
                }
                break;
            case 3:
                Collections.sort(mail);
                 
                for(String mail1 : mail){
                    
                    index = mail.indexOf(mail1);
                    System.out.print("\nİsim: " + isim.get(index));
                    System.out.println("Soyisim: " + soyIsim.get(index));
                    System.out.println("Mail: " + mail.get(index));
                    System.out.println("Telefon no: " + telefon.get(index)+"\n\n");
                }
                break;
            case 4:
                Collections.sort(telefon);
                 
                for(String telefon1 : telefon){
                    
                    index = telefon.indexOf(telefon1);
                    System.out.print("\nİsim: " + isim.get(index));
                    System.out.println("Soyisim: " + soyIsim.get(index));
                    System.out.println("Mail: " + mail.get(index));
                    System.out.println("Telefon no: " + telefon.get(index)+"\n\n");
                }
                break;
            default:
                
            
            
            
        }
        
    }
    
}
