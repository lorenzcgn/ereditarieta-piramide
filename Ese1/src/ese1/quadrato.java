/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1;

/**
 *
 * @author Cagni Lorenzo
 */
public class quadrato {
    
    private double lato;
    
    quadrato (double lato) {
        this.lato=lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }
    
    public double perimetro(){
        double perimetro=lato*4;
        return perimetro;
    }
    
    public double area(){
        double area=lato*lato;
        return area;
    }
    
    public void stampaRisultati(){
        System.out.println("L'area del quadrato che hai creato e' uguale a: "+this.area()+"\n"+
                "Il suo perimetro è invece uguale a: "+this.perimetro());
    }
    
}
