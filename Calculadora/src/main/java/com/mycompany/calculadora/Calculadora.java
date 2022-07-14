/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author Fabian Torres
 */
public class Calculadora {

    private int num1, num2;
    double suma, resta, mul, div, raiz, potencia, resultado;

    public Calculadora() {
        int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero de alguna de las dos opciones \n 1. si dese hacer una operación \n 2. Salir"));

        switch (op1) {
            case 1:
                menuoperaciones();
                break;

            case 2: 
                break;
            

        }

    }

    public void menuoperaciones() {
        int operacion = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite una de las opciones \n 1. Suma \n 2. Resta \n 3. multiplicacion \n 4. Division \n 5. Raiz \n 6. Potencia \n 7. Salir"));

        switch (operacion) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplica();
                break;
            case 4:
                divide();
                break;
            case 5:
                raiz();
                break;
            case 6:
                potencia();
                break;
            case 7:

                break;
            default:
                JOptionPane.showMessageDialog(null, "El numero digitado no esta dentro de los parametros");
                break;

        }

    }

    public void suma() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Escriba un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Escriba un segundo numero"));
        suma = (num1 + num2);
        resultado = Math.round(suma * 100.) / 100.00;
        JOptionPane.showMessageDialog(null, "el valor de la suma es: " + resultado);
        menuoperaciones();
        

    }

    public void resta() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Escriba un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Escriba un segundo numero"));
        resta = num1 - num2;
        resultado = Math.round(resta * 100.) / 100.00;
        JOptionPane.showMessageDialog(null, "el valor de la resta es: " + resultado);
        menuoperaciones();

    }

    public void multiplica() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Escriba un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Escriba un segundo numero"));
        mul = num1 * num2;
        resultado = Math.round(mul * 100.) / 100.00;
        JOptionPane.showMessageDialog(null, "el valor de la multiplicación es: " + resultado);
        menuoperaciones();
    }

    public void divide() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Escriba un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Escriba un segundo numero"));
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "La división entre cero es indeterminada");
            menuoperaciones();
        } 
        else {
            div = (double)num1 /(double)num2;
            resultado = Math.round(div * 100.0) / 100.0;
            System.out.println(resultado);
            JOptionPane.showMessageDialog(null, "el valor de la division es: " + resultado);
            menuoperaciones();
        }
        
    }

    public void raiz() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Escriba un numero"));
        raiz = Math.sqrt(num1);
        resultado = Math.round(raiz * 100.0) / 100.0;
        System.out.println(resultado);
        JOptionPane.showMessageDialog(null, "el valor de la raiz es: " + resultado);
        menuoperaciones();
    }

    public void potencia() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Escriba un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Escriba un segundo numero"));
        potencia = Math.pow(num1, num2);
        JOptionPane.showMessageDialog(null, "el valor de la potencia es: " + potencia);
        menuoperaciones();
    }

    public static void main(String[] args) {
        Calculadora object = new Calculadora();
        /*object.suma();
        object.resta();
        object.multiplica();
        object.divide();
        object.raiz();
        object.potencia();*/

    }

}
