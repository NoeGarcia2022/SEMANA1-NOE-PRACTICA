/*EJERCICO 3.
*Un docente universitario gana $8.00 la hora de clase y ha impartido 36 horas en un mes de clases. Debemos de
*calcular el salario del docente sabiendo que le van a descontar el 10% de la renta. ¿Cuánto ganara el docente al final de
*un mes de clases menos el descuento de la renta?*/
package ejercicios;

public class CalculoSalarioDocente {
    public static void main(String[] args) {
        //Declaramos variables
        double sueldoHora,totalHoras,salario,salarioFinal,renta;
        
        //Inicializamos Variables
        sueldoHora = 8.00;
        totalHoras = 36;
        renta = 0.10 ;
        
        //Uso de variables
        salario = (sueldoHora*totalHoras);
        salarioFinal = (salario-renta);
        
        System.out.println("El Decente en un mes de clases gana: " + salarioFinal + " dolares");
        
        
    }
    
}
