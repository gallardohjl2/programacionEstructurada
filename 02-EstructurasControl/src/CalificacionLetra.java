import javax.swing.*;

public class CalificacionLetra {

    public static void main(String[] args) {
        // Declaración de variables
        double calif=0.0;
        String salida = "";
        char letra = ' ';

        // Entradas
        calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la Calificación"));

        // Proceso
        if (calif>=0.0 && calif<=10.0){

            if(calif>=9.0){
                letra = 'A';
            }else if(calif>=8.0){
                letra = 'B';
            }else if (calif>=7.0){
                letra = 'C';
            }else if (calif>=6.0){
                letra='D';
            }else {
                letra = 'F';
            }

            salida = "Tu calificación " + calif + " corresponde a una letra: " + letra;

        }else{
            salida = "Calificación no valida";
        }

        // Bloque fuera de los if
        JOptionPane.showMessageDialog(null, salida);
    }
}
