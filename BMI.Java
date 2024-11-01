/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsbmi;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class hitungBMI {
    
    // Fungsi untuk menghitung BMI
    public static double hitungBMI(double berat, double tinggi) {
        double tinggiMeter = tinggi / 100; // Mengonversi tinggi dari cm ke meter
        return berat / (tinggiMeter * tinggiMeter); // Rumus BMI
    }

    // Fungsi untuk menentukan kategori BMI
    public static String kategoriBMI(double bmi) {
        if (bmi < 18.5) {
            return "Kekurangan berat badan";
        } else if (bmi < 24.9) {
            return "Normal";
        } else if (bmi < 29.9) {
            return "Kelebihan berat badan";
        } else {
            return "Obesitas";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dari pengguna
        System.out.println("Selamat datang di kalkulator BMI!");
        System.out.print("Masukkan berat badan Anda (dalam kg): ");
        double berat = scanner.nextDouble();
        System.out.print("Masukkan tinggi badan Anda (dalam cm): ");
        double tinggi = scanner.nextDouble();

        // Menghitung BMI
        double bmi = hitungBMI(berat, tinggi);

        // Menampilkan hasil
        System.out.printf("BMI Anda adalah: %.2f%n", bmi);
        System.out.println("Kategori: " + kategoriBMI(bmi));

        scanner.close();
    }
}  