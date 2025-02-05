
/*
   Evaluar si un número es mayor a 10, utilizando el operador
   ternario (?)

   (expresión)? parte true : parte false
 */


import javax.swing.*;

public class NumeroMayor {
    public static void main(String[] args) {

        //Declaración de variables
        double numero = 0.0;
        String salida = "";

        // Entrada
        numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número"));

        salida = !(numero>10)?"El numero es mayor a 10":"El número es menor a 10";

        JOptionPane.showMessageDialog(null, salida);

        if (!(numero >10)){
            salida = "El numero es mayor a 10";
        }else{
            salida = "El número es menor a 10";
        }


    }

}
