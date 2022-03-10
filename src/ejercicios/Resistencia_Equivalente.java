package ejercicios;

public class Resistencia_Equivalente {

    public static void main(String[] args) {
        
        //declarar variables
        double R1, R2, R3, R4, req;
        
        //inicializar variables
        
        R1 = 5.1;
        R2 = 68;
        R3 = 75;
        R4 = 84;
        
        
        req = ((1/R1)+(1/R2)+(1/R3)+(1/R4));
        
        System.out.println("La Resistencia Equivalente es: " + req);
    }
    
}
