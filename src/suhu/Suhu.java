/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;
import java.util.Scanner;
/**
 *
 * @author MOKLET-1
 */
public class Suhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("<<< MWNGHITUNG SUHU >>>");
        
        String[] suhu = {" ","Celcius => Fangrenheit", "Celcius => Kelvin", "Celcius => Reamur"};
            for (int i = 1; i < suhu.length; i++)  
            System.out.println(i+"."+suhu[i]);
       
        int celcius;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan suhu (C): ");
        celcius = input.nextInt();
        
        int kode, fahrenheit, kelvin, reamur;
        
        System.out.print("Masukkan Kode  : ");
        kode = input.nextInt();
        switch(kode){
            case 1 :
                fahrenheit = 9/5 * celcius +32;
                System.out.println("Hasil: " +fahrenheit);
                break;
            case 2 :
                kelvin = celcius + 273;
                System.out.println("Hasil: " +kelvin);
                break;
            case 3:
                reamur = celcius * 4/5;
                System.out.println("Hasil: " +reamur);
                break;
            default:
                System.out.println("EROR");
                break;
        }
        
    }
    
}
