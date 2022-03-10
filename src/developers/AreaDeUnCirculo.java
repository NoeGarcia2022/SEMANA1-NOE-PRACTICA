
package developers;

import java.text.DecimalFormat; //Importar las clases para el formato
import java.text.NumberFormat;

public class AreaDeUnCirculo {
    
    public static void main(String[] args) {
        
        NumberFormat formato = new DecimalFormat("#0.00");
        //Declarar variables
        double area, radio;
        final double  pi = 3.1416;
        
        area = 145;
        
        radio = Math.sqrt(area/pi);
        System.out.println("Radio: " + formato.format (radio) + " cm");
    }
    
}
