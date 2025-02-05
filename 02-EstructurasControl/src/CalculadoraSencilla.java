import javax.swing.*;

public class CalculadoraSencilla {
    public static void main(String[] args) {
        //Declaración de variables
        String menu = "";
        String opcion ="";
        double resultado = 0.0, numero1=0.0, numero2=0.0;

        menu = "MENU PRINCIPAL\n" +
                "1)Sumar\n2)Restar\n" +
                "3)Multiplicar\n" +
                "4)Dividir\n"+
                "5)Modulo\n" +
                "Elegir una opción:";

        opcion = JOptionPane.showInputDialog(menu);

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número 2"));

        if(numero2>0.0){
            switch (opcion){
                case "1":
                    //Suma
                    resultado =  numero1 + numero2;
                    JOptionPane.showMessageDialog
                            (null, "La suma es: " +resultado);
                    break;
                case "2":
                    //Resta
                    resultado =  numero1 - numero2;
                    JOptionPane.showMessageDialog
                            (null,"La resta es: " +  resultado);
                    break;
                case "3":
                    //Multiplicación
                    resultado =  numero1 * numero2;
                    JOptionPane.showMessageDialog
                            (null,"La Multiplicación es: " +  resultado);
                    break;
                case "4":
                    //Division
                    resultado =  numero1 / numero2;
                    JOptionPane.showMessageDialog
                            (null, "La División es: " + resultado);
                    break;
                case "5":
                    //Modulo
                    resultado =  numero1 % numero2;
                    JOptionPane.showMessageDialog
                            (null, "El modulo es: " + resultado);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Caso no valido");
            }
        }else{
            JOptionPane.showMessageDialog
                    (null, "El numero 2 no puede ser 0  negativo");
        }


        //JOptionPane.showMessageDialog(null, opcion);





    }

}
