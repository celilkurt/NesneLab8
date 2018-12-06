

package nesnelab8;

import java.util.Scanner;



public class NesneLab8 {

   
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secim =1;
        KayitDefteri d1 = new KayitDefteri();
        do{
            System.out.println("\nKayit eklemek icin 1'e\n"
                + "Kayit silmek icin 2'e\n"
                + "Mail güncelleme icin 3'e\n"
                + "Kayit yazdirma icin 4'e \n"
                + "Kayit siralama icin 5'e\n"
                    + "Cikmak icin 0'a basiniz.\n\n");
        secim = scan.nextInt();
        
        switch(secim){
            
            case 1:
                d1.kayitEkleme();
                break;
            case 2:
                d1.kayitSilme();
                break;
            case 3:
                d1.mailGuncel();
                break;
            case 4:
                d1.yazdirma();
                break;
            case 5:
                d1.siralama();
            default:
                System.out.println("Gecersiz secim.");
            
            
            
        }
        
        }while(secim!=0);
        
                
                
        
        
        
        
        
    }
    
}
