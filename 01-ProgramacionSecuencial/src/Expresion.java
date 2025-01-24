/*
* Calculaer el resultado de la expresión n = x+y/y-1,
* para los valores de x y y cualesquiera
*
* */


import javax.swing.*;

public class Expresion {
    public static void main(String[] args) {
        // Declaración de variables
        double x = 0.0;
        double y = 0.0;
        double n = 0.0;
        String salida = "";
        //Solicitar los datos
        x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y"));

        //Calcular la expresión
        n = (x + y)/ (y - 1);

        // Salida del Programa
        salida = "El resultado de la expresión es: " + String.format("%.2f",n);

        JOptionPane.showMessageDialog(null, salida);

    }
}
