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
public class practice14 {
    public static void main(String[] args){
        int i=0,count=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap xau ki tu: ");
        String n=sc.nextLine();
        while(n.charAt(i)== ' '||n.charAt(i)== '_')
            i++;
        for(int j=i;j<n.length()-1;j++)
            if(n.charAt(j)==' ' && n.charAt(j+1)!=' ')
                count++;  
        System.out.println("So tu trong xau = "+count);
    }
}
