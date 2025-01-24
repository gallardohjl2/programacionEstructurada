/*
 *
 * Realizar un programa que calcule e imprima el sueldo de un empleado, bajo las
 * siguientes características
 * a. Se debe almacenar el nombre del empleado
 * b. Las horas trabajadas que deben ser horas sin parte fraccionaria
 * c. Cuota por hora
 * d. Se debe imprimir el nombre del Trabajador y el Sueldo que va a percibir
 *
*/


import javax.swing.*;

public class SueldoEmpleado {
    public static void main(String[] args) {

        // Declaracion de variables
        String nombre="";
        int hT = 0;
        double cuotaHora = 0.0;
        double sueldo = 0.0;

        // Entrada de valores
        nombre = JOptionPane.showInputDialog("Introduce el nombre del Trabajador");
        cuotaHora = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cuota por hora"));
        hT = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas"));

        // Calculo de Sueldo
        sueldo = cuotaHora*hT;

        JOptionPane.showMessageDialog(null,"El empleado " + nombre +
                  "\n con " + hT + " horas trabajadas con una cuota de: " + cuotaHora +
                  "\n tiene un sueldo de: " + String.format("%.2f",sueldo));

    }
}
