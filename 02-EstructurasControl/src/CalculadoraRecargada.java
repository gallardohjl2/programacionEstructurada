import javax.swing.*;

public class CalculadoraRecargada {
    public static void main(String[] args) {
        //Declaración de variables
        String menu = "";
        String opcion ="", resultado = "";
        double numero1=0.0, numero2=0.0;

        menu = "MENU PRINCIPAL\n" +
                "a)Sumar\nb)Restar\n" +
                "c)Multiplicar\n" +
                "d)Dividir\n"+
                "e)Modulo\n" +
                "Elegir una opción:";

        opcion = JOptionPane.showInputDialog(menu);

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número 2"));

        opcion = opcion.toLowerCase();
        if(numero2>0.0){
            switch (opcion){
                case "a":
                case "A":
                    //Suma
                    resultado =  "La suma es: " + (numero1 + numero2);
                    break;
                case "b":
                case "B":
                    //Resta
                    resultado = "La resta es: " +  (numero1 - numero2);
                    break;
                case "c":
                case "C":
                    //Multiplicación
                    resultado =
                   "La Multiplicación es: " +  (numero1 * numero2);
                    break;
                case "d":
                case "D":
                    //Division
                    resultado =
                   "La División es: " + (numero1 / numero2);
                    break;
                case "e":
                case "E":
                    //Modulo
                    resultado = "El modulo es: " + (numero1 % numero2);
                    break;
                default:
                    resultado ="Caso no valido";
            }

            JOptionPane.showMessageDialog(null, resultado);
        }else{
            JOptionPane.showMessageDialog
                    (null, "El numero 2 no puede ser 0  negativo");
        }
    }
}
