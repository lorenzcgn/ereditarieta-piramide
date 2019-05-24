/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1;

import java.util.*;

/**
 *
 * @author Cagni Lorenzo
 */
public class Ese1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        quadrato q1=new quadrato(10);
        q1.stampaRisultati();
        
        System.out.println("Ora per creare una piramide retta partendo dal quadrato che hai creato inserisci l'altezza (se vuoi puoi anche cambiare anche la superficie)");
        double altezza;
        do{
            altezza=s.nextDouble();
        }while(altezza<=0);
        piramideRetta p1=new piramideRetta(q1.getLato(),altezza);
        
        p1.stampaRisultati();
        
    }
    
}
