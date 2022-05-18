package code;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
public class practice3 {
     public static void main(String[] args){
 double[][] weather = new double[10][4];
        //Doc file vao mang 2 chieu
        try {
            FileInputStream fis = new FileInputStream("d:/Java/weather.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bfr = new BufferedReader(isr);
            String line = bfr.readLine();
            int row = 0;
            while(line != null){
                String[] array = line.split(" ");
                for (int col = 0; col < 4; col++){
                    weather[row][col] = Double.parseDouble(array[col]);
                }
                row++;
                line = bfr.readLine();
            }
            fis.close();
            isr.close();
            bfr.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        for(int row=0;row<10;row++){
            for(int column=0;column<4;column++)
                System.out.print(weather[row][column]+" ");
        System.out.println();
        }
        double avgTemp =0,avgHum=0;
        for(int row=0;row<10;row++){
            avgTemp += weather[row][2];
            avgHum += weather[row][3];
        }
        avgTemp=avgTemp/10;
        avgHum=avgHum/10;
        System.out.println("Nhiet do TB la: "+ avgTemp);
        System.out.println("DO am TB la: "+ avgHum);
     }
 }


