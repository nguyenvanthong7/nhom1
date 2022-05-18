package code;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

public class practice1 {
    
    public static void main (String[] args ){
        
        int[][] matrix ={
            {'A','B','A','C','C','D','E','E','Â','D'},
            {'D','B','A','B','C','A','E','E','A','D'},
            {'E','D','D','A','C','B','E','E','A','D'},
            {'C','B','A','E','D','C','E','E','A','D'},
            {'A','B','D','C','C','D','E','E','A','D'},
            {'B','B','E','C','C','D','E','E','A','D'},
            {'B','B','A','C','C','D','E','E','A','D'},
            {'E','B','E','C','C','D','E','E','A','D'},
    };
        int[] key= {'D','B','D','C','C','D','A','E','A','D'};

              for(int row = 0; row < matrix.length ; row++) {
                  int sum=0;
                   for(int column = 0; column < matrix[row].length ; column++)
                   {
                        if(matrix[row][column]== key[column])
                            sum++;
                            
                       
                   }
                    System.out.println("Tong Diem Cua Sinh VIen Thu "+row+" la:"+sum);
                 
       }
   }   
}




