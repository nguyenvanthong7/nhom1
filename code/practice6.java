/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class practice6 {
      private String S="";
      private String C="";
      

      public void Nhap(){
            Scanner nhap = new Scanner(System.in);
            System.out.print("Nhap chuoi can ma hoa: ");
            S = nhap.next();
            
      }
       public void Nhap1(){
            Scanner nhap = new Scanner(System.in);
            System.out.print("Nhap chuoi da ma hoa: ");
            S = nhap.next();
           
      }
       public String GiaiMa(){

            String kq="";

            for(int i = 0;i<S.length();i++)

                  kq += (char) ('A' + (S.charAt(i) - 'A' + 21) % 26);

            return kq;

      }
      public String MaHoa(){
        
            for(int i = 0;i<S.length();i++)
                  C += (char) ('A' + (S.charAt(i) - 'A' + 5) % 26);
            return C;
      }
      
      public static void main(String[] args) {
            practice6 pr = new practice6();
            pr.Nhap();
            System.out.println("Sau khi ma hoa: "+pr.MaHoa());
            pr.Nhap1();
            System.out.println("Da duoc giai ma: "+pr.GiaiMa());
}
}
