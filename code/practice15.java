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
public class practice15 {
    public static void chuanhoa(String s){
        s=s.toLowerCase();
        String [] ss;
        String s2="";
        ss=s.split(" ");
        for(int i=0;i<ss.length;i++){
            String s1="";
            if(ss[i].length() != 0){
                s1+= Character.toUpperCase(ss[i].charAt(0));
                 if(ss[i].length() > 1) s1+= ss[i].substring(1);
                    s2+=s1;
                    if(i<ss.length) s2+=" ";
            }   
        }
        if(s2.charAt(s2.length()-1) == ' ') s2+="\b";
        System.out.print("Chuoi sau khi chuan hoa: "+s2);
                
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chuoi can chuan hoa: ");
        String str = sc.nextLine();
         System.out.print("Chuoi truoc khi chuan hoa: "+str+'\n');   
         chuanhoa(str);
         System.out.println();
         
        
    }
}
