package ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PromedioDeLaNota {
    public static void main(String[] args) {
        
        double p1, p2, p3, p4, p5, pm;
        NumberFormat formato = new DecimalFormat("#0.00");
        
        p1 = 8.0;
        p2 = 7.5;
        p3 = 9.0;
        p4 = 8.0;
        p5 = 9.0;
        
        
        pm = ((p1*0.25)+(p2*0.15)+(p3*0.15)+(p4*0.20)+(p5*0.25));
        
        System.out.println("El promedio final es: " + formato.format(pm));
    }
 
}
