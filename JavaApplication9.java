package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double heat;
        System.out.println("havanin sicakligi kactir?");
        heat=input.nextInt();
        
        if(heat<5) {
            System.out.println("KAYAK YAPABİLİRSİN.");
        }
        else if (heat>=5 && heat<=25){
            if(heat<15){
                System.out.println("SİNEMA YAPABİLİRSİN");
            }
            else if(heat >=15){
                System.out.println("PİKNİK YAPABİLİRSİN.");
                
            }
            
        }
        else{
            System.out.println("en iyisi evde otur dostum.");     
            }
        
        
        
    }
    
}
