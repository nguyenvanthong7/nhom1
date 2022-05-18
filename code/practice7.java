/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class practice7 {
    public static void main(String[] args){
        System.out.println("Nhap so chu so nguyen: ");
        Scanner input = new Scanner(System.in);
        int soChuSo = input.nextInt();
      
        for(int i = (int)Math.pow(10, soChuSo - 1); 
                i <= (int)Math.pow(10, soChuSo) - 1; i++){
            if(kiemTraSieuNguyenTo(i))
                System.out.println(i);
        }
    }
    
    public static boolean kiemTraSoNguyenTo(int num){
        if (num < 2)
            return false;
        for (int i = 2; i <= num/2; i++)
            if (num % i == 0)
                return false;
        return true;
    }
    
    public static boolean kiemTraSieuNguyenTo(int num){
        while (num > 0){
            if (!kiemTraSoNguyenTo(num))
                return false;
            num = num/10;
        }
        return true;
    }

}
