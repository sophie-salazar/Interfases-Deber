/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

public class Principal {
 public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Mamifero perro = new Perro();
        Mamifero gato = new Gato();

        // Mostrar los sonidos y comportamiento de los mamíferos
        System.out.println("Perro:");
        perro.hacerSonido();
        perro.amamantar();

        System.out.println("\nGato:");
        gato.hacerSonido();
        gato.amamantar();
    }
}
