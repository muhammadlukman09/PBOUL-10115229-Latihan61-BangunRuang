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
public class Tabung extends BangunRuang {

    private final double h;
    private final double r;
    
    
    public Tabung(double r, double h){
        this.h = h;
        this.r = r;
    }

    @Override
    public void volume() {
        double phi = Math.PI;
        double v = (phi * Math.pow(r, 2) * h);
        System.out.printf("Volume Tabung = %2.2f", v);
    }
    
}
