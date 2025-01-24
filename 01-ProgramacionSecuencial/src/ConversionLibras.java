/*
* Escribir un programa que convierta tres números de
* Kilogramos a libras (1 Libra = 0.454)
*
*
* */


import javax.swing.*;

public class ConversionLibras {
    public static void main(String[] args) {

        // Declaracion de constante
        final double FACTOR_CONVERSION = 0.454;

        // Declaración de variables de tres numeros dobles a convertir
        double numero1=0.0;
        double numero2=0.0;
        double numero3=0.0;
        double c1=0.0;
        double c2=0.0;
        double c3=0.0;
        String salida = "";

        // Solicitar los tres números a calcular

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 2"));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 3"));

        // Proceso de conversion
        c1 = numero1 / FACTOR_CONVERSION;
        c2 = numero2 / FACTOR_CONVERSION;
        c3 = numero3 / FACTOR_CONVERSION;

        // Salida o resultados de las operaciones
        salida = numero1 + " Kg" + " en Libras es: " + String.format("%.3f", c1) +
                 "\n" + numero2 + " Kg" + " en Libras es: " + String.format("%.3f", c2)  +
                "\n" + numero3 + " Kg" + " en Libras es: " + String.format("%.3f", c3) ;

        JOptionPane.showMessageDialog(null, salida);

    }
}
