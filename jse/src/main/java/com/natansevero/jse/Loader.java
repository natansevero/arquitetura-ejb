/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natansevero.jse;

import com.natansevero.shared.interfaces.Calculadora;

/**
 *
 * @author natan
 */
public class Loader {
    public static void main(String[] args) {
        
        Calculadora calculadora = new ServiceLocator().lookup("java:global/core/CalculadoraImpl");
        
        System.out.println(calculadora.somar(2, 2));
        
    }
}
