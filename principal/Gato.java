/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

class Gato implements Mamifero {

    // Implementación del método hacerSonido() de Animal
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace miau.");
    }

    // Implementación del método amamantar() de Mamifero
    @Override
    public void amamantar() {
        System.out.println("El gato amamanta a sus gatitos.");
    }
}
