/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1;

import static java.lang.Math.sqrt;

/**
 *
 * @author Cagni Lorenzo
 */
public class piramideRetta extends quadrato {
    
    private double altezza;

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
    
    public piramideRetta(double lato, double altezza) {
        super(lato);
        this.altezza=altezza;
    }
    
    public double supLaterale(){
        double apotema=sqrt((super.getLato()/2)*(super.getLato()/2)+(this.getAltezza()*this.getAltezza()));
        double areaLaterale = (apotema*super.perimetro())/2;
        return areaLaterale;
    }
    
    public double supTotale(){
        double areaTotale=supLaterale()+super.area();
        return areaTotale;
    }
    
    public double volume(){
        double volume=(super.area()*this.getAltezza())/3;
        return volume;
    }
    
    @Override
    public void stampaRisultati(){
        System.out.println("La superficie laterale della piramide che hai creato e' uguale a: "+this.supLaterale()+"\n"+
                "La superficie totale e' uguale a: "+this.supTotale()+"\n"+
                "Il suo volume è invece uguale a: "+this.volume());
    }
    
    
    
}
