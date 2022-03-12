/*EJERCICIO 2 
*Nos piden hacer un programa que calcule el valor de la moneda para los siguientes países: Europa, Reino Unido,
*Australia y Canadá. El programa tiene declarada una variable con el valor $100.00 de tipo double y tenemos que
*realizar la conversión de dólares a las monedas solicitadas. A continuación se muestra los valores de conversión:

*1 USD 0.70 Europa 0.61 Reino Unido 0.95 Australia 0.97 Canadá.*/
package ejercicios;

public class CalculoDeMonedas {
    public static void main(String[] args) {
        //Declaramos variables
        double dolares,Europa,ReinoUnido,Australia,Canada;
        double rE,rR,rA,rC;
        
        //Inicializamos variables
        dolares = 100.00;
        Europa = 0.70;
        ReinoUnido = 0.61;
        Australia = 0.95;
        Canada = 0.97;
        
        //Uso de variables 
        rE = ((dolares * Europa)/1);
        rR = ((dolares * ReinoUnido)/1);
        rA = ((dolares * Australia)/1);
        rC = ((dolares * Canada)/1);
        
        //mostrar en pantalla el resultado
        System.out.println("La conversion de $100 dolares a Euro es: " + rE + " Euros");
        System.out.println("La conversion de $100 dolares a Libra esterlina es: " + rR + " Libra esterlina");
        System.out.println("La conversion de $100 dolares a Dólar australiano es: " + rA + " Dólares australiano");
        System.out.println("La conversion de $100 dolares a Dólar canadiense es: " + rC + " Dólares canadiense");
    }
    
}
