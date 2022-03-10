package developers;

public class MiPrimerAplicacionJava {
    
    public static void main(String[] args) {
        //Declarar variables (ejempolos de algunos tipos de datos)
        String nombreCompleto, direccion, estadoCivil; //Tipo cadena de texto
        int edad;                                      //Tipo entero
        double gastosDiarios;                          //Tipo double
        char genero;                                   //Tipo char
        boolean poseeVehiculo;                         //Tipo booleana
        
        //Inicializacion de variables
        nombreCompleto = "Camila Esperanza Rosales";
        direccion = "Calle de la amargura desvio la tristeza";
        estadoCivil = "Soltera";
        edad = 30;
        gastosDiarios = 34.45;
        genero = 'F';
        poseeVehiculo = false;
        
        
       //Uso de variables (mostrar en pantalla las variables)
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Direccion      : " + direccion);
        System.out.println("Estado Civil   : " + estadoCivil);
        System.out.println("Edad           : " + edad);
        System.out.println("Gastos Diarios : " + gastosDiarios);
        System.out.println("Genero         : " + genero);
        System.out.println("Posee Vehiculo : " + poseeVehiculo);
    }
         
}
