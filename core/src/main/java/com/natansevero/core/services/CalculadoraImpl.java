/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natansevero.core.services;

import com.natansevero.shared.interfaces.Calculadora;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author natan
 */
@Remote(Calculadora.class)
@Stateless
public class CalculadoraImpl implements Calculadora {

    @Override
    public int somar(int n1, int n2) {
        return n1 + n2;
    }
    
}
