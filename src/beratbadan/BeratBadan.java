/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beratbadan;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class BeratBadan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Double berat, tinggi;
        Double BMI;  //--> BMI = berat / (tinggi * tinggi);
        String nama;
        System.out.println("------PROGRAM BERAT BADAN------");
        System.out.print  ("Masukkan Nama = ");
        nama = input.nextLine();
        System.out.print  ("Masukkan Berat Badan = ");
        berat = input.nextDouble();
        System.out.print  ("Masukkan Tinggi Badan = ");
        tinggi = input.nextDouble();
        BMI = berat / (tinggi * tinggi);
            if (BMI < 18.5){
                System.out.println("Anda Kurus");
            }
            else if(BMI <= 18.5 && BMI < 25.0){
                System.out.println("Anda Ideal");
            }
            else if(BMI <= 25.0 && BMI < 30.0){
                System.out.println("Anda Gemuk");
            }
            else if(BMI <= 30.0 && BMI < 35.0){
                System.out.println("Anda Sudah Obesitas Tingkat 1");
            }
            else if(BMI <= 35.0 && BMI < 40.0){
                System.out.println("Anda Sudah Obesitas Tingkat 2");
            }
            else{
                System.out.println("Anda Sudah Obesitas Tingkat 3");
            }
    }
}
