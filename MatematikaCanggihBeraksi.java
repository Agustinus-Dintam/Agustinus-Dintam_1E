/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatematikaCanggih;

/**
 *
 * @author ASUS
 */
// File: MatematikaCanggihBeraksi.java
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih matematikaCanggih = new MatematikaCanggih();

        int a = 10;
        int b = 3;

        System.out.println("Pertambahan: " + matematikaCanggih.pertambahan(a, b));
        System.out.println("Perkalian: " + matematikaCanggih.perkalian(a, b));
        System.out.println("Modulus: " + matematikaCanggih.modulus(a, b));
    }
}
