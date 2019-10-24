/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan61.bangunruang;

/**
 *
 * @author Lukman
 */
public class BolaBasket extends BangunRuang {
    
    private final double jari;

    public BolaBasket(double jari){
        this.jari = jari;
        
        
    }

    @Override
    public void volume() {
        double phi = Math.PI;
        double r = Math.pow(jari, 3);
        double v = (4*(phi*r))/3;
        System.out.printf("Volume Bola = %2.2f", v);
        
        
    }
       
    
    
    
    
    
}
